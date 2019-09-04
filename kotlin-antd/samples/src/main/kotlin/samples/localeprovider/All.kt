package samples.localeprovider

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.calendar.calendar
import antd.datepicker.datePicker
import antd.datepicker.rangePicker
import antd.localeprovider.Locale
import antd.localeprovider.enUS
import antd.localeprovider.localeProvider
import antd.localeprovider.zhCN
import antd.modal.ModalComponent
import antd.modal.modal
import antd.pagination.pagination
import antd.popconfirm.popconfirm
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.select.select
import antd.table.ColumnProps
import antd.table.table
import antd.timepicker.timePicker
import antd.transfer.transfer
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.classes
import kotlinx.html.id
import moment.moment
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*

private val tableColumns = arrayOf<ColumnProps<Any>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        filters = arrayOf(
            jsObject {
                text = "filter1"
                value = "filter1"
            }
        )
    },
    jsObject {
        title = "Age"
        dataIndex = "age"
    }
)

interface PageProps : RProps {
    var key: String
}

interface PageState : RState {
    var visible: Boolean
}

class Page : RComponent<PageProps, PageState>() {
    private val showModal: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val hideModal = fun (_: MouseEvent<HTMLElement>) {
        setState {
            visible = false
        }
    }

    override fun PageState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        val info: MouseEventHandler<Any> = {
            ModalComponent.info(jsObject {
                title = "some info"
                content = "some info"
            })
        }

        val confirm: MouseEventHandler<Any> = {
            ModalComponent.confirm(jsObject {
                title = "some info"
                content = "some info"
            })
        }

        div {
            attrs.classes = setOf("locale-components")
            div {
                attrs.classes = setOf("example")
                pagination {
                    attrs {
                        defaultCurrent = 1
                        total = 50
                        showSizeChanger = true
                    }
                }
            }
            div {
                attrs.classes = setOf("example")
                select {
                    attrs {
                        showSearch = true
                        style = js { width = 200 }
                    }
                    option {
                        attrs.value = "jack"
                        +"jack"
                    }
                    option {
                        attrs.value = "lucy"
                        +"lucy"
                    }
                }
                datePicker {}
                timePicker {}
                rangePicker {
                    attrs.style = js { width = 200 }
                }
            }
            div {
                attrs.classes = setOf("example")
                button {
                    attrs {
                        type = "primary"
                        onClick = showModal
                    }
                    +"Show Modal"
                }
                button {
                    attrs.onClick = info
                    +"Show info"
                }
                button {
                    attrs.onClick = confirm
                    +"Show confirm"
                }
                popconfirm {
                    attrs.title = "Question"
                    a {
                        attrs.href = "#"
                        +"Click to confirm"
                    }
                }
            }
            div {
                attrs.classes = setOf("example")
                transfer {
                    attrs {
                        dataSource = emptyArray()
                        showSearch = true
                        targetKeys = emptyArray()
                        render = { item -> item.title }
                    }
                }
                div {
                    attrs.jsStyle = js {
                        width = 319
                        border = "1px solid #d9d9d9"
                        borderRadius = 4
                    }
                    calendar {
                        attrs {
                            fullscreen = false
                            value = moment()
                        }
                    }
                }
                div {
                    attrs.classes = setOf("example")
                    table {
                        attrs {
                            dataSource = emptyArray()
                            columns = tableColumns
                        }
                    }
                }
                modal {
                    attrs {
                        title = "Locale Modal"
                        visible = state.visible
                        onCancel = hideModal
                    }
                    p { +"Locale Modal" }
                }
            }
        }
    }
}

fun RBuilder.page(handler: RHandler<PageProps>) = child(Page::class, handler)

interface PageAppState : RState {
    var locale: Locale?
}

class PageApp : RComponent<RProps, PageAppState>() {
    private val changeLocale = fun (event: RadioChangeEvent)  {
        val localeValue = event.target.value.unsafeCast<Locale?>()

        setState {
            locale = localeValue
        }

        if (localeValue != null) {
            moment.locale("en")
        } else {
            moment.locale("zh-cn")
        }
    }

    override fun PageAppState.init() {
        locale = null
    }

    override fun RBuilder.render() {
        div {
            div {
                attrs.classes = setOf("change-locale")
                span {
                    attrs.jsStyle = js { marginRight = 16 }
                    +"Change locale of components: "
                }
                radioGroup {
                    attrs {
                        defaultValue = undefined
                        onChange = changeLocale
                    }
                    radioButton {
                        attrs {
                            key = "en"
                            value = undefined
                        }
                        +"English"
                    }
                    radioButton {
                        attrs {
                            key = "cn"
                            value = zhCN
                        }
                        +"中文"
                    }
                }
            }
            localeProvider {
                attrs.locale = state.locale ?: enUS
                page {
                    attrs.key = if (state.locale != null) state.locale!!.locale else "en"
                }
            }
        }
    }
}

fun RBuilder.pageApp() = child(PageApp::class) {}

fun RBuilder.all() {
    div("locale-provider-container") {
        attrs.id = "locale-provider-all"
        pageApp()
    }
}
