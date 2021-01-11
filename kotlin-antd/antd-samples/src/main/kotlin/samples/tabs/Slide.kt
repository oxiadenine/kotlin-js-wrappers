package samples.tabs

import antd.divider.divider
import antd.radio.*
import antd.tabs.*
import kotlinext.js.*
import react.*
import react.dom.*
import samples.AppStyles
import styled.*

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
    divider {  }
    h3 { +"Slide Demo" }
    styledDiv {
        css {
            +TabsStyles.card
            +AppStyles.contentSection
        }
        slidingTabsDemo()
    }
}
