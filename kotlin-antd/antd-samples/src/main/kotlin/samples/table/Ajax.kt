package samples.table

import antd.table.*
import kotlinext.js.Object
import kotlinext.js.Record
import kotlinext.js.js
import kotlinext.js.jso
import kotlinx.browser.window
import react.*
import styled.css
import styled.styledDiv
import kotlin.js.json

private val tableColumns = arrayOf<ColumnType<Any>>(
    jso {
        title = "Name"
        dataIndex = "name"
        sorter = true
        render = { name, _, _ -> "${name.asDynamic().first} ${name.asDynamic().last}" }
        width = "20%"
    },
    jso {
        title = "Gender"
        dataIndex = "gender"
        filters = arrayOf(
            jso {
                text = "Male"
                value = "male"
            },
            jso {
                text = "Female"
                value = "female"
            }
        )
        width = "20%"
    },
    jso {
        title = "Email"
        dataIndex = "email"
    }
)

external interface AjaxAppState : State {
    var data: Array<Any>
    var pagination: TablePaginationConfig
    var loading: Boolean
}

class AjaxApp : RComponent<Props, AjaxAppState>() {
    private val handleTableChange = fun(newPagination: TablePaginationConfig, filters: Record<String, Array<String?>>, sorter: Any, _: TableCurrentDataSource<Any>) {
        val pager = state.pagination
        pager.current = newPagination.current

        setState {
            pagination = pager
        }

        console.log(newPagination, filters, sorter)

        val params = Object.assign(js {
            results = newPagination.pageSize
            page = newPagination.current
            sortField = sorter.unsafeCast<SorterResult<Any>>().field
            sortOrder = sorter.unsafeCast<SorterResult<Any>>().order
        }.unsafeCast<Any>(), filters)

        fetch(params)
    }

    private val fetch = fun(params: Any) {
        console.log("params:", params)

        setState {
            loading = true
        }

        val queryParams = Object.assign(js {
            results = 10
        }.unsafeCast<Any>(), params)

        val queryString = Object.keys(queryParams).mapIndexed { index, key ->
            return@mapIndexed if (queryParams.asDynamic()[key] != undefined) {
                if (index == 0) {
                    "$key=${queryParams.asDynamic()[key]}"
                } else {
                    "&$key=${queryParams.asDynamic()[key]}"
                }
            } else ""
        }.toTypedArray().joinToString("")

        window.fetch("https://randomuser.me/api?$queryString", jso {
            method = "GET"
            headers = json().apply {
                this["Content-Type"] = "application/json"
            }
        }).then { res -> res.json() }.then { res ->
            val newPagination = state.pagination
            // Read total count from server
            // pagination.total = data.totalCount;
            newPagination.total = 200

            setState {
                loading = false
                data = res.asDynamic().results.unsafeCast<Array<Any>>()
                pagination = newPagination
            }
        }
    }

    override fun AjaxAppState.init() {
        data = emptyArray()
        pagination = jso {}
        loading = false
    }

    override fun componentDidMount() {
        fetch(jso {})
    }

    override fun RBuilder.render() {
        table<Any, TableComponent<Any>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<Any>>()
                rowKey = fun(record: Any, _: Number): String {
                    return record.asDynamic().login.uuid.unsafeCast<String>()
                }
                dataSource = state.data
                pagination = state.pagination
                loading = state.loading
                onChange = handleTableChange
            }
        }
    }
}

fun RBuilder.ajaxApp() = child(AjaxApp::class) {}

fun RBuilder.ajax() {
    styledDiv {
        css { +TableStyles.ajax }
        ajaxApp()
    }
}
