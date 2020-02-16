package samples.radio

import antd.MouseEventHandler
import antd.button.button
import antd.radio.radio
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

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
    div("radio-container") {
        attrs.id = "radio-disabled"
        disabledApp()
    }
}
