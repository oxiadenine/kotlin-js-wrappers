package samples.tag

import antd.button.button
import antd.tag.tag
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface ControlledDemoState : State {
    var visible: Boolean
}

class ControlledDemo : RComponent<RProps, ControlledDemoState>() {
    override fun ControlledDemoState.init() {
        visible = true
    }

    override fun RBuilder.render() {
        div {
            tag {
                attrs {
                    closable = true
                    visible = state.visible
                    onClose = {
                        setState {
                            visible = false
                        }
                    }
                }
                +"Movies"
            }
            br {}
            button {
                attrs {
                    size = "small"
                    onClick = {
                        setState {
                            visible = !state.visible
                        }
                    }
                }
                +"Toggle"
            }
        }
    }
}

fun RBuilder.controlledDemo() = child(ControlledDemo::class) {}

fun RBuilder.controlled() {
    styledDiv {
        css { +TagStyles.controlled }
        controlledDemo()
    }
}
