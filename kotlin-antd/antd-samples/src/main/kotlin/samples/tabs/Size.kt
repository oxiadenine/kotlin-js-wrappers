package samples.tabs

import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.tabs.tabPane
import antd.tabs.tabs
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.div

interface SizeDemoState : RState {
    var size: String
}

class SizeDemo : RComponent<RProps, SizeDemoState>() {
    private val handleChange: (RadioChangeEvent) -> Unit = { e ->
        setState {
            size = e.target.value.unsafeCast<String>()
        }
    }

    override fun SizeDemoState.init() {
        size = "small"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    onChange = handleChange
                    value = state.size
                    style = js { marginBottom = 16 }
                }
                radioButton {
                    attrs.value = "small"
                    +"Small"
                }
                radioButton {
                    attrs.value = "default"
                    +"Default"
                }
                radioButton {
                    attrs.value = "large"
                    +"Large"
                }
            }
            tabs {
                attrs {
                    defaultActiveKey = "1"
                    size = state.size
                }
                tabPane {
                    attrs {
                        tab = "Tab 1"
                        key = "1"
                    }
                    +"Content of tab 1"
                }
                tabPane {
                    attrs {
                        tab = "Tab 2"
                        key = "2"
                    }
                    +"Content of tab 2"
                }
                tabPane {
                    attrs {
                        tab = "Tab 3"
                        key = "3"
                    }
                    +"Content of tab 3"
                }
            }
        }
    }
}

fun RBuilder.sizeDemo() = child(SizeDemo::class) {}

fun RBuilder.size() {
    div("tabs-container") {
        attrs.id = "tabs-size"
        sizeDemo()
    }
}
