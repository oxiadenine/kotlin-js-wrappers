package samples.tabs

import antd.select.SelectComponent
import antd.select.SelectValue
import antd.select.option
import antd.select.select
import antd.tabs.tabPane
import antd.tabs.tabs
import kotlinx.css.marginBottom
import kotlinx.css.px
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface PositionDemoState : State {
    var tabPosition: String
}

class PositionDemo : RComponent<Props, PositionDemoState>() {
    private val changeTabPosition = fun(value: SelectValue, _: Any) {
        setState {
            tabPosition = value.unsafeCast<String>()
        }
    }

    override fun PositionDemoState.init() {
        tabPosition = "top"
    }

    override fun RBuilder.render() {
        div {
            styledDiv {
                css { marginBottom = 16.px }
                +"Tab position："
                select<String, SelectComponent<String>> {
                    attrs {
                        value = state.tabPosition
                        onChange = changeTabPosition
                        dropdownMatchSelectWidth = false
                    }
                    option {
                        attrs.value = "top"
                        +"top"
                    }
                    option {
                        attrs.value = "bottom"
                        +"bottom"
                    }
                    option {
                        attrs.value = "left"
                        +"left"
                    }
                    option {
                        attrs.value = "right"
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
