package samples.table

import antd.Key
import antd.MouseEventHandler
import antd.button.button
import antd.table.*
import kotlinext.js.jso
import kotlinx.browser.window
import kotlinx.css.marginBottom
import kotlinx.css.marginLeft
import kotlinx.css.px
import react.*
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledSpan

private external interface RowSelectionAndOperationTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<RowSelectionAndOperationTableDataItem>>(
    jso {
        title = "Name"
        dataIndex = "name"
    },
    jso {
        title = "Age"
        dataIndex = "age"
    },
    jso {
        title = "Address"
        dataIndex = "address"
    }
)

private val tableData = (0..46).map { i ->
    jso<RowSelectionAndOperationTableDataItem> {
        key = "$i"
        name = "Edward King $i"
        age = 32
        address = "London, Park Lane no. $i"
    }
}.toTypedArray()

external interface RowSelectionAndOperationAppState : State {
    var selectedRowKeys: Array<Key>
    var loading: Boolean
}

class RowSelectionAndOperationApp : RComponent<Props, RowSelectionAndOperationAppState>() {
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

    private val handleSelectChange = fun(rowKeys: Any?, _: Array<RowSelectionAndOperationTableDataItem>) {
        console.log("selectedRowKeys changed: ", rowKeys)

        setState {
            selectedRowKeys = rowKeys.unsafeCast<Array<Key>>()
        }
    }

    override fun RowSelectionAndOperationAppState.init() {
        selectedRowKeys = emptyArray() // Check here to configure the default column
        loading = false
    }

    override fun RBuilder.render() {
        val tableRowSelection = jso<TableRowSelection<RowSelectionAndOperationTableDataItem>> {
            selectedRowKeys = state.selectedRowKeys
            onChange = handleSelectChange
        }

        val hasSelected = state.selectedRowKeys.isNotEmpty()

        div {
            styledDiv {
                css { marginBottom = 16.px }
                button {
                    attrs {
                        type = "primary"
                        onClick = start
                        disabled = !hasSelected
                        loading = state.loading
                    }
                    +"Reload"
                }
                styledSpan {
                    css { marginLeft = 8.px }
                    if (hasSelected) {
                        +"Selected ${state.selectedRowKeys.size} items"
                    } else +""
                }
            }
            table<RowSelectionAndOperationTableDataItem, TableComponent<RowSelectionAndOperationTableDataItem>> {
                attrs {
                    rowSelection = tableRowSelection
                    columns = tableColumns.unsafeCast<ColumnsType<RowSelectionAndOperationTableDataItem>>()
                    dataSource = tableData
                }
            }
        }
    }
}

fun RBuilder.rowSelectionAndOperationApp() = child(RowSelectionAndOperationApp::class) {}

fun RBuilder.rowSelectionAndOperation() {
    styledDiv {
        css { +TableStyles.rowSelectionAndOperation }
        rowSelectionAndOperationApp()
    }
}
