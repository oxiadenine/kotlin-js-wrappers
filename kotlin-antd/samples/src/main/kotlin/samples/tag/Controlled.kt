package samples.tag

import antd.button.button
import antd.tag.tag
import kotlinx.html.id
import react.*
import react.dom.br
import react.dom.div

interface ControlledDemoState : RState {
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
    div("tag-container") {
        attrs.id = "tag-controlled"
        controlledDemo()
    }
}
