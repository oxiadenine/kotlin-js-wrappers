package samples.table

import antd.MouseEventHandler
import antd.button.button
import antd.pagination.PaginationConfig
import antd.table.*
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.div

private val data = arrayOf(
        js {
            key = "1"
            name = "John Brown"
            age = 32
            address = "New York No. 1 Lake Park"
            tags = arrayOf("nice", "developer")
        },
        js {
            key = "2"
            name = "Jim Green"
            age = 42
            address = "London No. 1 Lake Park"
        },
        js {
            key = "3"
            name = "Joe Black"
            age = 32
            address = "Sidney No. 1 Lake Park"
        },
        js {
            key = "4"
            name = "Jim Red"
            age = 32
            address = "London No. 2 Lake Park"
        }
).unsafeCast<Array<Any>>()

interface ResetFilterAppState : RState {
    var filteredInfo: Any?
    var sortedInfo: SorterResult<Any>?
}

class ResetFilterApp : RComponent<RProps, ResetFilterAppState>() {
    private val handleChange = fun (pagination: PaginationConfig, filters: Any, sorter: SorterResult<Any>, _: TableCurrentDataSource<Any>) {
        console.log("Various parameters", pagination, filters, sorter)

        setState {
            filteredInfo = filters
            sortedInfo = sorter
        }
    }

    private val clearFilters: MouseEventHandler<Any> = {
        setState {
            filteredInfo = null
        }
    }

    private val clearAll: MouseEventHandler<Any> = {
        setState {
            filteredInfo = null
            sortedInfo = null
        }
    }

    private val setAgeSort: MouseEventHandler<Any> = {
        setState {
            sortedInfo = jsObject {
                order = "descend"
                columnKey = "age"
            }
        }
    }

    override fun ResetFilterAppState.init() {
        filteredInfo = null
        sortedInfo = null
    }

    override fun RBuilder.render() {
        val sortedInfo = state.sortedInfo ?: jsObject {}
        val filteredInfo = state.filteredInfo ?: js {}

        val tableColumns = arrayOf<ColumnProps<Any>>(
                jsObject {
                    title = "Name"
                    dataIndex = "name"
                    key = "name"
                    filters = arrayOf(
                            jsObject {
                                text = "Joe"
                                value = "Joe"
                            },
                            jsObject {
                                text = "Jim"
                                value = "Jim"
                            }
                    )
                    filteredValue = filteredInfo.name?.unsafeCast<Array<Any>>()
                    onFilter = { value, record ->
                        record.asDynamic().name.unsafeCast<String>().contains(value.unsafeCast<String>())
                    }
                    sorter = fun (a: Any, b: Any): Number {
                        return  a.asDynamic().name.unsafeCast<String>().length - b.asDynamic().name.unsafeCast<String>().length
                    }
                    sortOrder = if (sortedInfo.columnKey == "name") sortedInfo.order else null

                },
                jsObject {
                    title = "Age"
                    dataIndex = "age"
                    key = "age"
                    sorter = fun (a: Any, b: Any): Number {
                        return a.asDynamic().age.unsafeCast<Number>().toInt() - b.asDynamic().age.unsafeCast<Number>().toInt()
                    }
                    sortOrder = if (sortedInfo.columnKey == "age") sortedInfo.order else null
                },
                jsObject {
                    title = "Address"
                    dataIndex = "address"
                    key = "address"
                    filters = arrayOf(
                            jsObject {
                                text = "London"
                                value = "London"
                            },
                            jsObject {
                                text = "New York"
                                value = "New York"
                            }
                    )
                    filteredValue = filteredInfo.address?.unsafeCast<Array<Any>>()
                    onFilter = { value, record ->
                        record.asDynamic().address.unsafeCast<String>().contains(value.unsafeCast<String>())
                    }
                    sorter =  fun (a: Any, b: Any): Number {
                        return a.asDynamic().address.unsafeCast<String>().length - b.asDynamic().address.unsafeCast<String>().length
                    }
                    sortOrder = if (sortedInfo.columnKey == "address") sortedInfo.order else null
                }
        )

        div {
            div {
                attrs.classes = setOf("table-operations")
                button {
                    attrs.onClick = setAgeSort
                    +"Sort age"
                }
                button {
                    attrs.onClick = clearFilters
                    +"Clear filters"
                }
                button {
                    attrs.onClick = clearAll
                    +"Clear filters and sorters"
                }
            }
            table {
                attrs {
                    columns = tableColumns
                    dataSource = data
                    onChange = handleChange
                }
            }
        }
    }
}

fun RBuilder.resetFilterApp() = child(ResetFilterApp::class) {}

fun RBuilder.resetFilter() {
    div("table-container") {
        attrs.id = "table-reset-filter"
        resetFilterApp()
    }
}
