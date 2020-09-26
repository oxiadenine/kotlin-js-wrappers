package samples.table

import antd.form.*
import antd.input.input
import antd.inputnumber.*
import antd.pagination.*
import antd.popconfirm.*
import antd.table.*
import kotlinext.js.*
import kotlinx.html.js.*
import react.*
import react.dom.*
import styled.*

interface EditRowTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableData = (0..100).map { i ->
    jsObject<EditRowTableDataItem> {
        key = i.toString()
        name = "Edward $i"
        age = 32
        address = "London Park no. $i"
    }
}.toTypedArray()

private val editableContext = createContext<WrappedFormUtils<Any>>()

interface EditRowEditableCellProps : RProps {
    var title: String
    var dataIndex: String
    var record: Any
    var children: Any
    var index: Number
    var editing: Boolean
    var inputType: String
}

interface EditRowEditableCellState : RState {
    var editing: Boolean
}

class EditRowEditableCell : RComponent<EditRowEditableCellProps, EditRowEditableCellState>() {
    private val getInput: () -> ReactElement = {
        buildElement {
            if (props.inputType == "number") {
                inputNumber {}
            }

            input {}
        }
    }

    private val renderCell: (WrappedFormUtils<Any>) -> ReactElement = { form ->
        buildElement {
            td {
                Object.assign(attrs, props)
                if (props.editing) {
                    formItem {
                        attrs.style = js { margin = 0 }
                        childList.add(form.getFieldDecorator(props.dataIndex, jsObject {
                            rules = arrayOf(jsObject {
                                required = true
                                message = "Please Input ${props.title}"
                            })
                            initialValue = props.record.asDynamic()[props.dataIndex].unsafeCast<Any>()
                        })(getInput()))
                    }
                } else childList.add(props.children)
            }
        }
    }

    override fun EditRowEditableCellState.init() {
        editing = false
    }

    override fun RBuilder.render() {
        editableContext.Consumer { form ->
            childList.add(renderCell(form))
        }
    }
}

interface EditRowEditableTableProps : FormComponentProps<Any>

interface EditRowEditableTableState : RState {
    var data: Array<EditRowTableDataItem>
    var editingKey: String
}

class EditRowEditableTable : RComponent<EditRowEditableTableProps, EditRowEditableTableState>() {
    private val tableColumns = arrayOf(
        js {
            title = "name"
            dataIndex = "name"
            width = "25%"
            editable = true
        },
        js {
            title = "age"
            dataIndex = "age"
            width = "15%"
            editable = true
        },
        js {
            title = "address"
            dataIndex = "address"
            width = "40%"
            editable = true
        },
        jsObject<ColumnProps<EditRowTableDataItem>> {
            title = "operation"
            dataIndex = "operation"
            render = { _, record, _ ->
                val editable = isEditing(record)

                buildElement {
                    if (editable) {
                        span {
                            editableContext.Consumer { form ->
                                a {
                                    attrs {
                                        href = "javascript:;"
                                        onClickFunction = {
                                            save(form.unsafeCast<WrappedFormUtils<Any>>(), record.key)
                                        }
                                        jsStyle = js { marginRight = 8 }
                                    }
                                    +"Save"
                                }
                            }
                            popconfirm {
                                attrs {
                                    title = "Sure to cancel?"
                                    onConfirm = { cancel() }
                                }
                                a { +"Cancel" }
                            }
                        }
                    } else {
                        a {
                            attrs["disabled"] = state.editingKey != ""
                            attrs.onClickFunction = {
                                edit(record.key)
                            }
                            +"Edit"
                        }
                    }
                }
            }
        }
    ).unsafeCast<Array<Any>>()

    private val isEditing: (Any) -> Boolean = { record ->
        record.asDynamic().key.unsafeCast<String>() == state.editingKey
    }

    private val cancel: () -> Unit = {
        setState {
            editingKey = ""
        }
    }

    private val save = fun(form: WrappedFormUtils<Any>, key: String) {
        form.validateFields { errors, row ->
            if (errors != null) {
                return@validateFields
            }

            val newData = state.data.map { item ->
                if (item.asDynamic().key.unsafeCast<String>() == key) {
                    Object.assign(item, row)
                } else item
            }.toTypedArray()

            setState {
                data = newData
                editingKey = ""
            }
        }
    }

    private val edit: (String) -> Unit = { key ->
        setState {
            editingKey = key
        }
    }

    override fun EditRowEditableTableState.init() {
        data = tableData
        editingKey = ""
    }

    override fun RBuilder.render() {
        val tableComponents = jsObject<TableComponents> {
            body = jsObject {
                cell = EditRowEditableCell::class.js
            }
        }

        val newTableColumns = tableColumns.map { col ->
            if (!col.asDynamic().editable.unsafeCast<Boolean>()) {
                return@map col
            }

            val obj = js {
                onCell = { cellRecord: Any ->
                    js {
                        record = cellRecord
                        inputType = if (col.asDynamic().dataIndex.unsafeCast<String>() == "age") "number" else "text"
                        editable = col.asDynamic().editable.unsafeCast<Boolean>()
                        dataIndex = col.asDynamic().dataIndex.unsafeCast<String>()
                        title = col.asDynamic().title.unsafeCast<String>()
                        editing = isEditing(cellRecord)
                    }
                }
            }

            Object.assign(obj, col)
        }.toTypedArray()

        div {
            editableContext.Provider(props.form) {
                table<EditRowTableDataItem, TableComponent<EditRowTableDataItem>> {
                    attrs {
                        components = tableComponents
                        bordered = true
                        dataSource = state.data
                        columns = newTableColumns
                        rowClassName = { _, _ -> "editable-row" }
                        pagination = jsObject<PaginationConfig> {
                            onChange = { _, _ -> cancel() }
                        }
                    }
                }
            }
        }
    }
}

private val editRowEditableForm = FormComponent.create<EditRowEditableTableProps, EditRowEditableTableState>()(
    EditRowEditableTable::class.js.unsafeCast<JsClass<Component<EditRowEditableTableProps, EditRowEditableTableState>>>())

fun RBuilder.editRowEditableTable(handler: RHandler<EditRowEditableTableProps>) = child(editRowEditableForm, jsObject {}, handler)

fun RBuilder.editRow() {
    styledDiv {
        css { +TableStyles.editRow }
        editRowEditableTable {}
    }
}
