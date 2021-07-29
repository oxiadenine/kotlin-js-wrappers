package samples.table

import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jsObject
import react.RBuilder
import react.dom.div
import react.dom.h4
import styled.css
import styled.styledDiv

private external interface SizeTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<SizeTableDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
    },
    jsObject {
        title = "Age"
        dataIndex = "age"
    },
    jsObject {
        title = "Address"
        dataIndex = "address"
    }
)

private val tableData = arrayOf<SizeTableDataItem>(
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
    }
)

fun RBuilder.size() {
    styledDiv {
        css { +TableStyles.size }
        div {
            h4 { +"Middle size table" }
            table<SizeTableDataItem, TableComponent<SizeTableDataItem>> {
                attrs {
                    columns = tableColumns.unsafeCast<ColumnsType<SizeTableDataItem>>()
                    dataSource = tableData
                    size = "middle"
                }
            }
            h4 { +"Small size table" }
            table<SizeTableDataItem, TableComponent<SizeTableDataItem>> {
                attrs {
                    columns = tableColumns.unsafeCast<ColumnsType<SizeTableDataItem>>()
                    dataSource = tableData
                    size = "small"
                }
            }
        }
    }
}
