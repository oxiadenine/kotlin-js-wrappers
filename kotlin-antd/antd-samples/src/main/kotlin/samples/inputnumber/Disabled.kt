package samples.inputnumber

import antd.MouseEventHandler
import antd.button.button
import antd.inputnumber.inputNumber
import kotlinx.css.marginTop
import kotlinx.css.px
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface DisabledAppState : State {
    var disabled: Boolean
}

class DisabledApp : RComponent<Props, DisabledAppState>() {
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
