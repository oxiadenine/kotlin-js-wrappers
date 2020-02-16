package samples.inputnumber

import antd.MouseEventHandler
import antd.button.button
import antd.inputnumber.inputNumber
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface DisabledAppState : RState {
    var disabled: Boolean
}

class DisabledApp : RComponent<RProps, DisabledAppState>() {
    private val toggle: MouseEventHandler<Any> = {
        setState {
            disabled = !state.disabled
        }
    }

    override fun DisabledAppState.init() {
        disabled = true
    }

    override fun RBuilder.render() {
        div {
            inputNumber {
                attrs {
                    min = 1
                    max = 10
                    disabled = state.disabled
                    defaultValue = 3
                }
            }
            div {
                attrs.jsStyle = js { marginTop = 20 }
                button {
                    attrs {
                        onClick = toggle
                        type = "primary"
                    }
                    +"Toggle disabled"
                }
            }
        }
    }
}

fun RBuilder.disabledApp() = child(DisabledApp::class) {}

fun RBuilder.disabled() {
    div("input-number-container") {
        attrs.id = "input-number-disabled"
        disabledApp()
    }
}
