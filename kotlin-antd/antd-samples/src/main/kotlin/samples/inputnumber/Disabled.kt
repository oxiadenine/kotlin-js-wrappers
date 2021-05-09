package samples.inputnumber

import antd.*
import antd.button.button
import antd.inputnumber.*
import kotlinx.css.marginTop
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

external interface DisabledAppState : RState {
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
            styledDiv {
                css { marginTop = 20.px }
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
    styledDiv {
        css { +InputNumberStyles.disabled }
        disabledApp()
    }
}
