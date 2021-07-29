package samples.configprovider

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.calendar.calendar
import antd.configprovider.configProvider
import antd.datepicker.datePicker
import antd.datepicker.rangePicker
import antd.localeprovider.Locale
import antd.localeprovider.enUS
import antd.localeprovider.zhCN
import antd.modal.ModalComponent
import antd.modal.modal
import antd.pagination.pagination
import antd.popconfirm.popconfirm
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import antd.transfer.TransferComponent
import antd.transfer.TransferItem
import antd.transfer.transfer
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.css.marginRight
import kotlinx.css.px
import moment.moment
import org.w3c.dom.HTMLElement
import react.*
import react.dom.a
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv
import styled.styledSpan

private val tableColumns = arrayOf<ColumnType<Any>>(
    jsObject {
        title = "Name"
        dataIndex = "name"
        filters = arrayOf(jsObject {
            text = "filter1"
            value = "filter1"
        })
    },
    jsObject {
        title = "Age"
        dataIndex = "age"
    }
)

external interface LocalePageProps : RProps {
    var key: String
}

external interface LocalePageState : State {
    var visible: Boolean
}

class LocalePage : RComponent<LocalePageProps, LocalePageState>() {
    private val showModal: MouseEventHandler<Any> = {
        setState { visible = true }
    }

    private val hideModal = { _: MouseEvent<HTMLElement> ->
        setState { visible = false }
    }

    override fun LocalePageState.init() {
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

        div(classes = "locale-components") {
            div(classes = "example") {
                pagination {
                    attrs {
                        defaultCurrent = 1
                        total = 50
                        showSizeChanger = true
                    }
                }
            }
            div(classes = "example") {
                select<String, SelectComponent<String>> {
                    attrs {
                        showSearch = true
                        style = js { width = 200 }
                    }
                    option {
                        attrs.value = "jack"
                        +"Jack"
                    }
                    option {
                        attrs.value = "lucy"
                        +"Lucy"
                    }
                }
                datePicker {}
                rangePicker {
                    attrs.style = js { width = 200 }
                }
            }
            div(classes = "example") {
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
                    attrs.title = "Question?"
                    a {
                        attrs.href = "#"
                        +"Click to confirm"
                    }
                }
            }
            div(classes = "example") {
                transfer<TransferItem, TransferComponent<TransferItem>> {
                    attrs {
                        dataSource = emptyArray()
                        showSearch = true
                        targetKeys = emptyArray()
                        render = { item -> item.title!! }
                    }
                }
            }
            div(classes = "site-config-provider-calendar-wrapper") {
                calendar {
                    attrs {
                        fullscreen = false
                        value = moment()
                    }
                }
            }
            div(classes = "example") {
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

fun RBuilder.localePage(handler: RHandler<LocalePageProps>) = child(LocalePage::class, handler)

external interface LocaleAppState : State {
    var locale: Locale?
}

class LocaleApp : RComponent<RProps, LocaleAppState>() {
    init {
        setState {
            locale = enUS
        }
    }

    private val changeLocale = { e: RadioChangeEvent ->
        val localeValue = e.target.value?.unsafeCast<Locale>()

        setState { locale = localeValue }

        if (localeValue != null) {
            moment.locale("en")
        } else {
            moment.locale("zh-cn")
        }

        Unit
    }

    override fun RBuilder.render() {
        div {
            div(classes = "change-locale") {
                styledSpan {
                    css { marginRight = 16.px }
                    +"Change locale of components: "
                }
                radioGroup {
                    attrs {
                        value = state.locale
                        onChange = changeLocale
                    }
                    radioButton {
                        attrs {
                            key = "en"
                            value = enUS
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
            configProvider {
                attrs.locale = state.locale
                localePage {
                    attrs.key = if (state.locale != null) {
                        state.locale!!.locale
                    } else "en"
                }
            }
        }
    }
}

fun RBuilder.localeApp() = child(LocaleApp::class) {}

fun RBuilder.locale() {
    styledDiv {
        css { +ConfigProviderStyles.locale }
        localeApp()
    }
}
