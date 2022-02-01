package samples.table

import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jso
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv

private external interface FixedColumnsTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<FixedColumnsTableDataItem>>(
    jso {
        title = "Full Name"
        width = 100
        dataIndex = "name"
        key = "name"
        fixed = "left"
    },
    jso {
        title = "Age"
        width = 100
        dataIndex = "age"
        key = "age"
        fixed = "left"
    },
    jso {
        title = "Column 1"
        dataIndex = "address"
        key = "1"
    },
    jso {
        title = "Column 2"
        dataIndex = "address"
        key = "2"
    },
    jso {
        title = "Column 3"
        dataIndex = "address"
        key = "3"
    },
    jso {
        title = "Column 4"
        dataIndex = "address"
        key = "4"
    },
    jso {
        title = "Column 5"
        dataIndex = "address"
        key = "5"
    },
    jso {
        title = "Column 6"
        dataIndex = "address"
        key = "6"
    },
    jso {
        title = "Column 7"
        dataIndex = "address"
        key = "7"
    },
    jso {
        title = "Column 8"
        dataIndex = "address"
        key = "8"
    },
    jso {
        title = "Action"
        key = "operation"
        fixed = "right"
        width = 100
        render = { _, _, _ ->
            buildElement {
                a {
                    attrs.href = "javascript:;"
                    +"action"
                }
            }
        }
    }
)

private val tableData = arrayOf<FixedColumnsTableDataItem>(
    jso {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York Park"
    },
    jso {
        key = "2"
        name = "Jim Green"
        age = 40
        address = "London Park"
    }
)

fun RBuilder.fixedColumns() {
    styledDiv {
        css { +TableStyles.fixedColumns }
        table<FixedColumnsTableDataItem, TableComponent<FixedColumnsTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<FixedColumnsTableDataItem>>()
                dataSource = tableData
                scroll = jso { x = 1300 }
            }
        }
    }
}
