package samples.table

import antd.table.ColumnProps
import antd.table.TableComponent
import antd.table.TableRowSelection
import antd.table.table
import kotlinext.js.Object
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div

private interface RowSelectionTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnProps<RowSelectionTableDataItem>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            key = "name"
            render = { text, _, _ ->
                buildElement {
                    a {
                        attrs.href = "javascript:;"
                        +text.unsafeCast<String>()
                    }
                }!!
            }
        },
        jsObject {
            title = "Age"
            dataIndex = "age"
            key = "age"
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
            key = "address"
        }
)

private val data = arrayOf<RowSelectionTableDataItem>(
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
            name = "Disabled User"
            age = 99
            address = "Sidney No. 1 Lake Park"
        }
)

// rowSelection object indicates the need for row selection
private val tableRowSelection = jsObject<TableRowSelection<RowSelectionTableDataItem>> {
    onChange = { selectedRowKeys, selectedRows ->
        console.log("selectedRowKeys: $selectedRowKeys", "selectedRows: ", selectedRows)
    }
    getCheckboxProps = { record ->
        js {
            disabled = record.name == "Disabled User" // Column configuration not to be checked
            name = record.name
        }.unsafeCast<Object>()
    }
}

fun RBuilder.rowSelection() {
    div("table-container") {
        attrs.id = "table-row-selection"
        table<RowSelectionTableDataItem, TableComponent<RowSelectionTableDataItem>> {
            attrs {
                rowSelection = tableRowSelection
                columns = tableColumns
                dataSource = data
            }
        }
    }
}
