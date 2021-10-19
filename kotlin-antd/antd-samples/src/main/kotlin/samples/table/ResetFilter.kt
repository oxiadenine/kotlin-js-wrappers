package samples.table

import antd.MouseEventHandler
import antd.button.button
import antd.table.*
import kotlinext.js.Record
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.classes
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface ResetFilterTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var tags: Array<String>
}

private val tableData = arrayOf<ResetFilterTableDataItem>(
    jsObject {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York No. 1 Lake Park"
        tags = arrayOf("nice", "developer")
    },
    jsObject {
        key = "2"
        name = "Jim Green"
        age = 42
        address = "London No. 1 Lake Park"
    },
    jsObject {
        key = "3"
        name = "Joe Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
    },
    jsObject {
        key = "4"
        name = "Jim Red"
        age = 32
        address = "London No. 2 Lake Park"
    }
)

external interface ResetFilterAppState : State {
    var filteredInfo: Any?
    var sortedInfo: SorterResult<ResetFilterTableDataItem>?
}

class ResetFilterApp : RComponent<Props, ResetFilterAppState>() {
    private val handleChange = fun(pagination: TablePaginationConfig, filters: Record<String, Array<String?>>, sorter: Any, _: TableCurrentDataSource<ResetFilterTableDataItem>) {
        console.log("Various parameters", pagination, filters, sorter)

        setState {
            filteredInfo = filters
            sortedInfo = sorter.unsafeCast<SorterResult<ResetFilterTableDataItem>>()
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

        val tableColumns = arrayOf<ColumnProps<ResetFilterTableDataItem>>(
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
                    record.name.contains(value.unsafeCast<String>())
                }
                sorter = fun(a: ResetFilterTableDataItem, b: ResetFilterTableDataItem): Number {
                    return a.name.length - b.name.length
                }
                sortOrder = if (sortedInfo.columnKey == "name") sortedInfo.order else null

            },
            jsObject {
                title = "Age"
                dataIndex = "age"
                key = "age"
                sorter = fun(a: ResetFilterTableDataItem, b: ResetFilterTableDataItem): Number {
                    return a.age.toInt() - b.age.toInt()
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
                    record.address.contains(value.unsafeCast<String>())
                }
                sorter = fun(a: ResetFilterTableDataItem, b: ResetFilterTableDataItem): Number {
                    return a.address.length - b.address.length
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
            table<ResetFilterTableDataItem, TableComponent<ResetFilterTableDataItem>> {
                attrs {
                    columns = tableColumns.unsafeCast<ColumnsType<ResetFilterTableDataItem>>()
                    dataSource = tableData
                    onChange = handleChange
                }
            }
        }
    }
}

fun RBuilder.resetFilterApp() = child(ResetFilterApp::class) {}

fun RBuilder.resetFilter() {
    styledDiv {
        css { +TableStyles.resetFilter }
        resetFilterApp()
    }
}
