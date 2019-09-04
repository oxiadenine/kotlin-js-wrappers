package samples.table

import antd.divider.divider
import antd.form.form
import antd.form.formItem
import antd.icon.icon
import antd.pagination.PaginationConfig
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.switch.switch
import antd.table.*
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinext.js.objectAssign
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.a
import react.dom.div
import react.dom.p
import react.dom.span

private val tableColumns = arrayOf<ColumnProps<Any>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            key = "name"
            width = 150
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
            width = 70
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
            key = "address"
        },
        jsObject {
            title = "Action"
            key = "action"
            width = 360
            render = { _, record, _ ->
                buildElement {
                   span {
                       a {
                           attrs.href = "javascript:;"
                           +"Action 一 ${record.asDynamic().name}"
                       }
                       divider {
                           attrs.type = "vertical"
                       }
                       a {
                           attrs.href = "javascript:;"
                           +"Delete"
                       }
                       divider {
                           attrs.type = "vertical"
                       }
                       a {
                           attrs {
                               href = "javascript:;"
                               className = "ant-dropdown-link"
                           }
                           +"More actions "
                           icon {
                               attrs.type = "down"
                           }
                       }
                   }
                }!!
            }
        }
)

private val data = (0..100).map { i ->
    js {
        key = i
        name = "John Brown"
        age = "${i}2"
        address = "New York No. $i Lake Park"
        description = "My name is John Brown, I am ${i}2 years old, living in New York No. $i Lake Park."
    }
}.toTypedArray().unsafeCast<Array<Any>>()

private val tableExpandedRowRender: (Any) -> ReactElement = { record ->
    buildElement {
        p { +record.asDynamic().description.unsafeCast<String>() }
    }!!
}
private val tableTitle: () -> String = { "Here is title" }
private const val tableShowHeader = true
private val tableFooter: () -> String = { "Here is footer" }
private val tableScroll = jsObject<TableScroll> { y = 240 }
private val tablePagination = jsObject<PaginationConfig> { position = "bottom" }

interface DynamicSettingsDemoState : RState {
    var bordered: Boolean
    var loading: Boolean
    var pagination: Any?
    var size: TableSize
    var expandedRowRender: ((Any) -> ReactElement)?
    var title: (() -> String)?
    var showHeader: Boolean
    var footer: (() -> String)?
    var rowSelection: TableRowSelection<Any>?
    var scroll: TableScroll?
    var hasData: Boolean
}

class DynamicSettingsDemo : RComponent<RProps, DynamicSettingsDemoState>() {
    private val handleToggle = fun (prop: String, enable: Boolean) {
        val objState: dynamic = state

        objState[prop] = enable

        setState(objState.unsafeCast<DynamicSettingsDemoState>())
    }

    private val handleSizeChange = fun (e: RadioChangeEvent) {
        setState {
            size = e.target.value.unsafeCast<TableSize>()
        }
    }

    private val handleExpandChange = fun (enable: Boolean) {
        setState {
            expandedRowRender = if (enable) tableExpandedRowRender else undefined
        }
    }

    private val handleTitleChange = fun (enable: Boolean) {
        setState {
            title = if (enable) tableTitle else undefined
        }
    }

    private val handleHeaderChange = fun (enable: Boolean) {
        setState {
            showHeader = if (enable) tableShowHeader else false
        }
    }

    private val handleFooterChange = fun (enable: Boolean) {
        setState {
            footer = if (enable) tableFooter else undefined
        }
    }

    private val handleRowSelectionChange = fun (enable: Boolean) {
        setState {
            rowSelection = if (enable) jsObject {} else undefined
        }
    }

    private val handleScrollChange = fun (enable: Boolean) {
        setState {
            scroll = if (enable) tableScroll else undefined
        }
    }

    private val handleDataChange = fun (enable: Boolean) {
        setState {
            hasData = enable
        }
    }

    private val handlePaginationChange = fun (e: RadioChangeEvent) {
        val value = e.target.value.unsafeCast<String>()

        setState {
            pagination = if (value == "none") false else jsObject<PaginationConfig> { position = value }
        }
    }

    override fun DynamicSettingsDemoState.init() {
        bordered = false
        loading = false
        pagination = tablePagination
        size = "default"
        expandedRowRender = tableExpandedRowRender
        title = undefined
        showHeader = tableShowHeader
        footer = tableFooter
        rowSelection = jsObject {}
        scroll = undefined
        hasData = true
    }

    override fun RBuilder.render() {
        div {
            div {
                attrs.classes = setOf("components-table-demo-control-bar")
                form {
                    attrs.layout = "inline"
                    formItem {
                        attrs.label = "Bordered"
                        switch {
                            attrs {
                                checked = state.bordered
                                onChange = { checked, _ -> handleToggle("bordered", checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Loading"
                        switch {
                            attrs {
                                checked = state.loading
                                onChange = { checked, _ -> handleToggle("loading", checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Title"
                        switch {
                            attrs {
                                checked = state.title != null
                                onChange = { checked, _ -> handleTitleChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Column Header"
                        switch {
                            attrs {
                                checked = state.showHeader
                                onChange = { checked, _ -> handleHeaderChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Footer"
                        switch {
                            attrs {
                                checked = state.footer != null
                                onChange = { checked, _ -> handleFooterChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Expandable"
                        switch {
                            attrs {
                                checked = state.expandedRowRender != null
                                onChange = { checked, _ -> handleExpandChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Checkbox"
                        switch {
                            attrs {
                                checked = state.rowSelection != null
                                onChange = { checked, _ -> handleRowSelectionChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Fixed Header"
                        switch {
                            attrs {
                                checked = state.scroll != null
                                onChange = { checked, _ -> handleScrollChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Has Data"
                        switch {
                            attrs {
                                checked = state.hasData
                                onChange = { checked, _ -> handleDataChange(checked) }
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Size"
                        radioGroup {
                            attrs {
                                size = "default"
                                value = state.size
                                onChange = handleSizeChange
                            }
                            radioButton {
                                attrs.value = "default"
                                +"Default"
                            }
                            radioButton {
                                attrs.value = "middle"
                                +"Middle"
                            }
                            radioButton {
                                attrs.value = "small"
                                +"Small"
                            }
                        }
                    }
                    formItem {
                        attrs.label = "Pagination"
                        radioGroup {
                            attrs {
                                value = state.pagination?.unsafeCast<PaginationConfig>()!!.position ?: "none"
                                onChange = handlePaginationChange
                            }
                            radioButton {
                                attrs.value = "top"
                                +"Top"
                            }
                            radioButton {
                                attrs.value = "bottom"
                                +"Bottom"
                            }
                            radioButton {
                                attrs.value = "both"
                                +"Both"
                            }
                            radioButton {
                                attrs.value = "none"
                                +"None"
                            }
                        }
                    }
                }
            }
            table {
                objectAssign(attrs, state)
                attrs {
                    columns = tableColumns
                    dataSource = if (state.hasData) data else null
                }
            }
        }
    }
}

fun RBuilder.dynamicSettingsDemo() = child(DynamicSettingsDemo::class) {}

fun RBuilder.dynamicSettings() {
    div("table-container") {
        attrs.id = "table-dynamic-settings"
        dynamicSettingsDemo()
    }
}
