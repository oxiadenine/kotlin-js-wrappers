package samples.table

import antd.table.*
import kotlinext.js.*
import react.*
import styled.*

private external interface ExpandChildrenTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var children: Array<ExpandChildrenTableDataItem>
}

private val tableColumns = arrayOf<ColumnType<ExpandChildrenTableDataItem>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        key = "name"
    },
    jsObject {
        title = "Age"
        dataIndex = "age"
        key = "age"
        width = "12%"
    },
    jsObject {
        title = "Address"
        dataIndex = "address"
        width = "30%"
        key = "address"
    }
)

private val tableData = arrayOf<ExpandChildrenTableDataItem>(
    jsObject {
        key = "1"
        name = "John Brown sr."
        age = 60
        address = "New York No. 1 Lake Park"
        children = arrayOf(
            jsObject {
                key = "11"
                name = "John Brown"
                age = 42
                address = "New York No. 2 Lake Park"
            },
            jsObject {
                key = "12"
                name = "John Brown jr."
                age = 30
                address = "New York No. 3 Lake Park"
                children = arrayOf(
                    jsObject {
                        key = "121"
                        name = "Jimmy Brown"
                        age = 16
                        address = "New York No. 3 Lake Park"
                    }
                )
            },
            jsObject {
                key = "13"
                name = "Jim Green sr."
                age = 72
                address = "London No. 1 Lake Park"
                children = arrayOf(
                    jsObject {
                        key = "131"
                        name = "Jim Green"
                        age = 42
                        address = "London No. 2 Lake Park"
                        children = arrayOf(
                            jsObject {
                                key = "1311"
                                name = "Jim Green jr."
                                age = 25
                                address = "London No. 3 Lake Park"
                            },
                            jsObject {
                                key = "1312"
                                name = "Jimmy Green sr."
                                age = 18
                                address = "London No. 4 Lake Park"
                            }
                        )
                    }
                )
            }
        )
    },
    jsObject {
        key = "2"
        name = "John Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
    }
)

private val tableRowSelection = jsObject<TableRowSelection<ExpandChildrenTableDataItem>> {
    onChange = { selectedRowKeys, selectedRows ->
        console.log("selectedRowKeys: $selectedRowKeys", "selectedRows: ", selectedRows)
    }
    onSelect = { record, selected, selectedRows, _ ->
        console.log(record, selected, selectedRows)
    }
    onSelectAll = { selected, selectedRows, changeRows ->
        console.log(selected, selectedRows, changeRows)
    }
}

fun RBuilder.expandChildren() {
    styledDiv {
        css { +TableStyles.expandChildren }
        table<ExpandChildrenTableDataItem, TableComponent<ExpandChildrenTableDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<ExpandChildrenTableDataItem>>()
                rowSelection = tableRowSelection
                dataSource = tableData
            }
        }
    }
}
