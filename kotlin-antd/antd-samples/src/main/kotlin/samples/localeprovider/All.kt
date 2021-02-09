package samples.localeprovider

import antd.*
import antd.button.button
import antd.calendar.*
import antd.datepicker.*
import antd.datepicker.rangePicker
import antd.localeprovider.*
import antd.localeprovider.Locale
import antd.modal.*
import antd.pagination.*
import antd.popconfirm.*
import antd.radio.*
import antd.select.SelectComponent
import antd.select.select
import antd.table.*
import antd.timepicker.*
import antd.timepicker.timePicker
import antd.transfer.*
import kotlinext.js.*
import kotlinx.html.*
import moment.*
import org.w3c.dom.*
import react.*
import react.dom.*
import styled.*

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

    private val hideModal = fun(_: MouseEvent<HTMLElement>) {
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
                select<String, SelectComponent<String>> {
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
                    table<Any, TableComponent<Any>> {
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
    private val changeLocale = fun(event: RadioChangeEvent) {
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
    styledDiv {
        css { LocaleProviderStyles.all }
        pageApp()
    }
}
