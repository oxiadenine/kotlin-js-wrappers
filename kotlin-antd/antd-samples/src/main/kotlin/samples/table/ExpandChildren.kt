package samples.table

import antd.table.*
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

private external interface ExpandChildrenTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
    var children: Array<ExpandChildrenTableDataItem>
}

private val tableColumns = arrayOf<ColumnType<ExpandChildrenTableDataItem>>(
    jso {
        title = "Name"
        dataIndex = "name"
        key = "name"
    },
    jso {
        title = "Age"
        dataIndex = "age"
        key = "age"
        width = "12%"
    },
    jso {
        title = "Address"
        dataIndex = "address"
        width = "30%"
        key = "address"
    }
)

private val tableData = arrayOf<ExpandChildrenTableDataItem>(
    jso {
        key = "1"
        name = "John Brown sr."
        age = 60
        address = "New York No. 1 Lake Park"
        children = arrayOf(
            jso {
                key = "11"
                name = "John Brown"
                age = 42
                address = "New York No. 2 Lake Park"
            },
            jso {
                key = "12"
                name = "John Brown jr."
                age = 30
                address = "New York No. 3 Lake Park"
                children = arrayOf(
                    jso {
                        key = "121"
                        name = "Jimmy Brown"
                        age = 16
                        address = "New York No. 3 Lake Park"
                    }
                )
            },
            jso {
                key = "13"
                name = "Jim Green sr."
                age = 72
                address = "London No. 1 Lake Park"
                children = arrayOf(
                    jso {
                        key = "131"
                        name = "Jim Green"
                        age = 42
                        address = "London No. 2 Lake Park"
                        children = arrayOf(
                            jso {
                                key = "1311"
                                name = "Jim Green jr."
                                age = 25
                                address = "London No. 3 Lake Park"
                            },
                            jso {
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
    jso {
        key = "2"
        name = "John Black"
        age = 32
        address = "Sidney No. 1 Lake Park"
    }
)

private val tableRowSelection = jso<TableRowSelection<ExpandChildrenTableDataItem>> {
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
