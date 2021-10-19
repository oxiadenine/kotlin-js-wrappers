package samples.table

import antd.Key
import antd.table.*
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

private external interface RowSelectionCustomTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<RowSelectionCustomTableDataItem>>(
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

private val tableData = (0..46).map { i ->
    jsObject<RowSelectionCustomTableDataItem> {
        key = "$i"
        name = "Edward King $i"
        age = 32
        address = "London, Park Lane no. $i"
    }
}.toTypedArray()

external interface RowSelectionCustomAppState : State {
    var selectedRowKeys: Array<Key>
}

class RowSelectionCustomApp : RComponent<Props, RowSelectionCustomAppState>() {
    private val handleSelectChange = fun(rowKeys: Any?, _: Array<RowSelectionCustomTableDataItem>) {
        console.log("selectedRowKeys changed: ", rowKeys)

        setState {
            selectedRowKeys = rowKeys.unsafeCast<Array<Key>>()
        }
    }

    override fun RowSelectionCustomAppState.init() {
        selectedRowKeys = emptyArray() // Check here to configure the default column
    }

    override fun RBuilder.render() {
        val tableRowSelection = jsObject<TableRowSelection<RowSelectionCustomTableDataItem>> {
            selectedRowKeys = state.selectedRowKeys
            onChange = handleSelectChange
            selections = arrayOf<SelectionItem>(
                jsObject {
                    key = "all-data"
                    text = "Select All Data"
                    onSelect = { changableRowKeys ->
                        setState {
                            selectedRowKeys = changableRowKeys // 0...45
                        }
                    }
                },
                jsObject {
                    key = "odd"
                    text = "Select Odd Row"
                    onSelect = { changableRowKeys ->
                        val newSelectedRowKeys = changableRowKeys.filterIndexed { index, _ ->
                            if (index % 2 != 0) {
                                return@filterIndexed false
                            }

                            true
                        }.toTypedArray()

                        setState {
                            selectedRowKeys = newSelectedRowKeys
                        }
                    }
                },
                jsObject {
                    key = "even"
                    text = "Select Even Row"
                    onSelect = { changableRowKeys ->
                        val newSelectedRowKeys = changableRowKeys.filterIndexed { index, _ ->
                            if (index % 2 != 0) {
                                return@filterIndexed true
                            }

                            false
                        }.toTypedArray()

                        setState {
                            selectedRowKeys = newSelectedRowKeys
                        }
                    }
                }
            ).unsafeCast<Array<Any>>()
        }

        table<RowSelectionCustomTableDataItem, TableComponent<RowSelectionCustomTableDataItem>> {
            attrs {
                rowSelection = tableRowSelection
                columns = tableColumns.unsafeCast<ColumnsType<RowSelectionCustomTableDataItem>>()
                dataSource = tableData
            }
        }
    }
}

fun RBuilder.rowSelectionCustomApp() = child(RowSelectionCustomApp::class) {}

fun RBuilder.rowSelectionCustom() {
    styledDiv {
        css { +TableStyles.rowSelectionCustom }
        rowSelectionCustomApp()
    }
}
