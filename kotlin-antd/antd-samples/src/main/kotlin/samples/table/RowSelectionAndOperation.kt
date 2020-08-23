package samples.table

import antd.MouseEventHandler
import antd.button.button
import antd.table.ColumnProps
import antd.table.TableComponent
import antd.table.TableRowSelection
import antd.table.table
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.div
import react.dom.jsStyle
import react.dom.span
import kotlinx.browser.window

private interface RowSelectionAndOperationTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnProps<RowSelectionAndOperationTableDataItem>>(
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

private val data = (0..46).map { i ->
    jsObject<RowSelectionAndOperationTableDataItem> {
        key = "$i"
        name = "Edward King $i"
        age = 32
        address = "London, Park Lane no. $i"
    }
}.toTypedArray()

interface RowSelectionAndOperationAppState : RState {
    var selectedRowKeys: Array<String>
    var loading: Boolean
}

class RowSelectionAndOperationApp : RComponent<RProps, RowSelectionAndOperationAppState>() {
    private val start: MouseEventHandler<Any> = {
        setState {
            loading = true
        }
        // ajax request after empty completing
        window.setTimeout({
            setState {
                selectedRowKeys = emptyArray()
                loading = false
            }
        }, 1000)
    }

    private val handleSelectChange = fun (rowKeys: Any?, _: Array<RowSelectionAndOperationTableDataItem>) {
        console.log("selectedRowKeys changed: ", rowKeys)

        setState {
            selectedRowKeys = rowKeys.unsafeCast<Array<String>>()
        }
    }

    override fun RowSelectionAndOperationAppState.init() {
        selectedRowKeys = emptyArray() // Check here to configure the default column
        loading = false
    }

    override fun RBuilder.render() {
        val tableRowSelection = jsObject<TableRowSelection<RowSelectionAndOperationTableDataItem>> {
            selectedRowKeys = state.selectedRowKeys
            onChange = handleSelectChange
        }

        val hasSelected = state.selectedRowKeys.isNotEmpty()

        div {
            div {
                attrs.jsStyle = js { marginBottom = 16 }
                button {
                    attrs {
                        type = "primary"
                        onClick = start
                        disabled = !hasSelected
                        loading = state.loading
                    }
                    +"Reload"
                }
                span {
                    attrs.jsStyle = js { marginLeft = 8 }
                    if (hasSelected) {
                        +"Selected ${state.selectedRowKeys.size} items"
                    } else +""
                }
            }
            table<RowSelectionAndOperationTableDataItem, TableComponent<RowSelectionAndOperationTableDataItem>> {
                attrs {
                    rowSelection = tableRowSelection
                    columns = tableColumns
                    dataSource = data
                }
            }
        }
    }
}

fun RBuilder.rowSelectionAndOperationApp() = child(RowSelectionAndOperationApp::class) {}

fun RBuilder.rowSelectionAndOperation() {
    div("table-container") {
        attrs.id = "table-row-selection-and-operation"
        rowSelectionAndOperationApp()
    }
}
