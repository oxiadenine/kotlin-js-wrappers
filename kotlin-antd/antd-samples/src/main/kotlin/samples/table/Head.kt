package samples.table

import antd.table.*
import kotlinext.js.Record
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

private external interface HeadTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<HeadTableDataItem>>(
    jso {
        title = "Name"
        dataIndex = "name"
        filters = arrayOf(
            jso {
                text = "Joe"
                value = "Joe"
            },
            jso {
                text = "Jim"
                value = "Jim"
            },
            jso {
                text = "Submenu"
                value = "Submenu"
                children = arrayOf(
                    jso {
                        text = "Green"
                        value = "Green"
                    },
                    jso {
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
        sorter = fun(a: HeadTableDataItem, b: HeadTableDataItem): Number {
            return a.name.length - b.name.length
        }
        sortDirections = arrayOf("descend")

    },
    jso {
        title = "Age"
        dataIndex = "age"
        defaultSortOrder = "descend"
        sorter = fun(a: HeadTableDataItem, b: HeadTableDataItem): Number {
            return a.age.toInt() - b.age.toInt()
        }
    },
    jso {
        title = "Address"
        dataIndex = "address"
        filters = arrayOf(
            jso {
                text = "London"
                value = "London"
            },
            jso {
                text = "New York"
                value = "New York"
            }
        )
        filterMultiple = false
        onFilter = { value, record ->
            record.address.indexOf(value.unsafeCast<String>()) == 0
        }
        sorter = fun(a: HeadTableDataItem, b: HeadTableDataItem): Number {
            return a.address.length - b.address.length
        }
        sortDirections = arrayOf("descend", "ascend")
    }
)

private val tableData = arrayOf<HeadTableDataItem>(
    jso {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York No. 1 Lake Park"
    },
    jso {
        key = "2"
        name = "Jim Green"
        age = 42
        address = "London No. 1 Lake Park"
    },
    jso {
        key = "3"
        name = "Joe Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
    },
    jso {
        key = "4"
        name = "Jim Red"
        age = 32
        address = "London No. 2 Lake Park"
    }
)

private val handleChange = { pagination: TablePaginationConfig, filters: Record<String, Array<String?>>, sorter: Any, _: TableCurrentDataSource<HeadTableDataItem> ->
    console.log("params", pagination, filters, sorter)
}

fun RBuilder.head() {
    styledDiv {
        css { +TableStyles.head }
        table<HeadTableDataItem, TableComponent<HeadTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<HeadTableDataItem>>()
                dataSource = tableData
                onChange = handleChange
            }
        }
    }
}
