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
import antd.select.SelectComponent
import antd.select.select
import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import antd.timepicker.timePicker
import antd.transfer.TransferComponent
import antd.transfer.TransferItem
import antd.transfer.transfer
import kotlinext.js.js
import kotlinext.js.jso
import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.html.classes
import moment.moment
import org.w3c.dom.HTMLElement
import react.*
import react.dom.a
import react.dom.div
import react.dom.option
import react.dom.p
import styled.css
import styled.styledDiv
import styled.styledSpan

private val tableColumns = arrayOf<ColumnType<Any>>(
    jso {
        title = "Name"
        dataIndex = "name"
        filters = arrayOf(
            jso {
                text = "filter1"
                value = "filter1"
            }
        )
    },
    jso {
        title = "Age"
        dataIndex = "age"
    }
)

external interface PageProps : Props {
    var key: String
}

external interface PageState : State {
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
            ModalComponent.info(jso {
                title = "some info"
                content = "some info"
            })
        }

        val confirm: MouseEventHandler<Any> = {
            ModalComponent.confirm(jso {
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
                transfer<TransferItem, TransferComponent<TransferItem>> {
                    attrs {
                        dataSource = emptyArray()
                        showSearch = true
                        targetKeys = emptyArray()
                        render = { item -> item.title!! }
                    }
                }
                styledDiv {
                    css {
                        width = 319.px
                        border(1.px, BorderStyle.solid, Color("#d9d9d9"))
                        borderRadius = 4.px
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
                            columns = tableColumns.unsafeCast<ColumnsType<Any>>()
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

external interface PageAppState : State {
    var locale: Locale?
}

class PageApp : RComponent<Props, PageAppState>() {
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
                styledSpan {
                    css { marginRight = 16.px }
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
