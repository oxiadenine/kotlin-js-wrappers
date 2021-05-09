package samples.table

import antd.table.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private external interface FixedColumnsTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<FixedColumnsTableDataItem>>(
    jsObject {
        title = "Full Name"
        width = 100
        dataIndex = "name"
        key = "name"
        fixed = "left"
    },
    jsObject {
        title = "Age"
        width = 100
        dataIndex = "age"
        key = "age"
        fixed = "left"
    },
    jsObject {
        title = "Column 1"
        dataIndex = "address"
        key = "1"
    },
    jsObject {
        title = "Column 2"
        dataIndex = "address"
        key = "2"
    },
    jsObject {
        title = "Column 3"
        dataIndex = "address"
        key = "3"
    },
    jsObject {
        title = "Column 4"
        dataIndex = "address"
        key = "4"
    },
    jsObject {
        title = "Column 5"
        dataIndex = "address"
        key = "5"
    },
    jsObject {
        title = "Column 6"
        dataIndex = "address"
        key = "6"
    },
    jsObject {
        title = "Column 7"
        dataIndex = "address"
        key = "7"
    },
    jsObject {
        title = "Column 8"
        dataIndex = "address"
        key = "8"
    },
    jsObject {
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
    jsObject {
        key = "1"
        name = "John Brown"
        age = 32
        address = "New York Park"
    },
    jsObject {
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
                scroll = jsObject { x = 1300 }
            }
        }
    }
}
