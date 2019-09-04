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

interface SlidingTabsDemoState : RState {
    var mode: String
}

class SlidingTabsDemo : RComponent<RProps, SlidingTabsDemoState>() {
    private val handleModeChange: (RadioChangeEvent) -> Unit = { e ->
        setState {
            mode = e.target.value.unsafeCast<String>()
        }
    }

    override fun SlidingTabsDemoState.init() {
        mode = "top"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    onChange = handleModeChange
                    value = state.mode
                    style = js { marginBottom = 8 }
                }
                radioButton {
                    attrs.value = "top"
                    +"Horizontal"
                }
                radioButton {
                    attrs.value = "left"
                    +"Vertical"
                }
            }
            tabs {
                attrs {
                    defaultActiveKey = "1"
                    tabPosition = state.mode
                    style = js { height = 220 }
                }
                (0..30).map { i ->
                    tabPane {
                        attrs {
                            tab = "Tab-$i"
                            key = "$i"
                        }
                        +"Content of tab $i"
                    }
                }.toTypedArray()
            }
        }
    }
}

fun RBuilder.slidingTabsDemo() = child(SlidingTabsDemo::class) {}

fun RBuilder.slide() {
    div("tabs-container") {
        attrs.id = "tabs-slide"
        slidingTabsDemo()
    }
}
