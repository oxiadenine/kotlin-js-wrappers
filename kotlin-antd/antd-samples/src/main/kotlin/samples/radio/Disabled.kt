package samples.radio

import antd.*
import antd.button.button
import antd.radio.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface DisabledAppState : RState {
    var disabled: Boolean
}

class DisabledApp : RComponent<RProps, DisabledAppState>() {
    private val toggleDisabled: MouseEventHandler<Any> = {
        setState {
            disabled = !state.disabled
        }
    }

    override fun DisabledAppState.init() {
        disabled = true
    }

    override fun RBuilder.render() {
        div {
            radio {
                attrs {
                    defaultChecked = false
                    disabled = state.disabled
                }
                +"Disabled"
            }
            br {}
            radio {
                attrs {
                    defaultChecked = true
                    disabled = state.disabled
                }
                +"Disabled"
            }
            div {
                attrs.jsStyle = js { marginTop = 20 }
                button {
                    attrs {
                        type = "primary"
                        onClick = toggleDisabled
                    }
                    +"Toggle disabled"
                }
            }
        }
    }
}

fun RBuilder.disabledApp() = child(DisabledApp::class) {}

fun RBuilder.disabled() {
    styledDiv {
        css { +RadioStyles.disabled }
        disabledApp()
    }
}
