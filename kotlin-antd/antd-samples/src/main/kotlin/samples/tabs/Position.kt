package samples.tabs

import antd.divider.divider
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.select.*
import antd.select.option
import antd.tabs.*
import kotlinext.js.*
import kotlinx.css.border
import kotlinx.css.borderRadius
import kotlinx.css.padding
import kotlinx.css.px
import react.*
import react.dom.div
import react.dom.h3
import react.dom.jsStyle
import styled.*

interface PositionDemoState : RState {
    var tabPosition: String
}

class PositionDemo : RComponent<RProps, PositionDemoState>() {
    private val changeTabPosition = fun(event: RadioChangeEvent) {
        setState {
            tabPosition = event.target.value.unsafeCast<String>()
        }
    }

    override fun PositionDemoState.init() {
        tabPosition = "top"
    }

    override fun RBuilder.render() {
        divider {  }
        h3 { +"Position Demo" }
        styledDiv {
            css {
                border = "1px solid lightgrey"
                borderRadius = 1.px
                padding = "10px"
            }
            div {
                attrs.jsStyle = js { marginBottom = 24 }
                +"Tab position："
                radioGroup {
                    attrs {
                        value = state.tabPosition
                        onChange = changeTabPosition
                    }
                    radioButton {
                        attrs {
                            value = "top"
                        }
                        +"top"
                    }
                    radioButton {
                        attrs {
                            value = "bottom"
                        }
                        +"bottom"
                    }
                    radioButton {
                        attrs {
                            value = "left"
                        }
                        +"left"
                    }
                    radioButton {
                        attrs {
                            value = "right"
                        }
                        +"right"
                    }
                }
            }
            tabs {
                attrs.tabPosition = state.tabPosition
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

fun RBuilder.positionDemo() = child(PositionDemo::class) {}

fun RBuilder.position() {
    styledDiv {
        css { +TabsStyles.position }
        positionDemo()
    }
}
