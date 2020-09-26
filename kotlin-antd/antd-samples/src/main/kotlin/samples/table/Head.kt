package samples.table

import antd.pagination.PaginationConfig
import antd.table.*
import kotlinext.js.jsObject
import react.RBuilder
import styled.css
import styled.styledDiv

private interface HeadTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnProps<HeadTableDataItem>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            filters = arrayOf(
                    jsObject {
                        text = "Joe"
                        value = "Joe"
                    },
                    jsObject {
                        text = "Jim"
                        value = "Jim"
                    },
                    jsObject {
                        text = "Submenu"
                        value = "Submenu"
                        children = arrayOf(
                                jsObject {
                                    text = "Green"
                                    value = "Green"
                                },
                                jsObject {
                                    text = "Black"
                                    value = "Black"
                                }
                        )
                    }
            )
            // specify the condition of filtering result
            // here is that finding the name started with `value`
            onFilter = { value, record ->
                record.name.indexOf(value.unsafeCast<String>()) == 0
            }
            sorter = fun (a: HeadTableDataItem, b: HeadTableDataItem): Number {
               return  a.name.length - b.name.length
            }
            sortDirections = arrayOf("descend")

        },
        jsObject {
            title = "Age"
            dataIndex = "age"
            defaultSortOrder = "descend"
            sorter = fun (a: HeadTableDataItem, b: HeadTableDataItem): Number {
                return a.age.toInt() - b.age.toInt()
            }
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
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
            filterMultiple = false
            onFilter = { value, record ->
                record.address.indexOf(value.unsafeCast<String>()) == 0
            }
            sorter =  fun (a: HeadTableDataItem, b: HeadTableDataItem): Number {
                return a.address.length - b.address.length
            }
            sortDirections = arrayOf("descend", "ascend")
        }
)

private val data = arrayOf<HeadTableDataItem>(
        jsObject {
            key = "1"
            name = "John Brown"
            age = 32
            address = "New York No. 1 Lake Park"
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

private fun onChange(pagination: PaginationConfig, filters: Any, sorter: SorterResult<HeadTableDataItem>, extra: TableCurrentDataSource<HeadTableDataItem>) {
    console.log("params", pagination, filters, sorter)
}

fun RBuilder.head() {
    styledDiv {
        css { +TableStyles.head }
        table<HeadTableDataItem, TableComponent<HeadTableDataItem>> {
            attrs {
                columns = tableColumns
                dataSource = data
                onChange = ::onChange
            }
        }
    }
}
