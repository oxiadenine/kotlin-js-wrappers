package samples.table

import antd.pagination.PaginationConfig
import antd.table.*
import kotlinext.js.*
import kotlinx.html.id
import react.*
import react.dom.div
import kotlin.browser.window
import kotlin.js.json

private val tableColumns = arrayOf<ColumnProps<Any>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            sorter = true
            render = { name, _, _ -> "${name.asDynamic().first} ${name.asDynamic().last}" }
            width = "20%"
        },
        jsObject {
            title = "Gender"
            dataIndex = "gender"
            filters = arrayOf(
                    jsObject {
                        text = "Male"
                        value = "male"
                    },
                    jsObject {
                        text = "Female"
                        value = "female"
                    }
            )
            width = "20%"
        },
        jsObject {
            title = "Email"
            dataIndex = "email"
        }
)

interface AjaxAppState : RState {
    var data: Array<Any>
    var pagination: PaginationConfig
    var loading: Boolean
}

class AjaxApp : RComponent<RProps, AjaxAppState>() {
    private val handleTableChange = fun (newPagination: PaginationConfig, filters: Any, sorter: SorterResult<Any>, _: TableCurrentDataSource<Any>) {
        val pager = state.pagination
        pager.current = newPagination.current

        setState {
            pagination = pager
        }

        console.log(newPagination, filters, sorter)

        val params = objectAssign(js {
            results = newPagination.pageSize
            page = newPagination.current
            sortField = sorter.field
            sortOrder = sorter.order
        }.unsafeCast<Any>(), filters)

        fetch(params)
    }

    private val fetch = fun (params: Any) {
        console.log("params:", params)

        setState {
            loading = true
        }

        val queryParams = objectAssign(js {
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

        window.fetch("https://randomuser.me/api?$queryString", jsObject {
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
        pagination = jsObject {}
        loading = false
    }

    override fun componentDidMount() {
        fetch(jsObject {})
    }

    override fun RBuilder.render() {
        table {
            attrs {
                columns = tableColumns
                rowKey = fun (record: Any, _: Number): String {
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
    div("table-container") {
        attrs.id = "table-ajax"
        ajaxApp()
    }
}
