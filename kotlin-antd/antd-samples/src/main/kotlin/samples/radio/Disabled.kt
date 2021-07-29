package samples.radio

import antd.MouseEventHandler
import antd.button.button
import antd.radio.radio
import kotlinx.css.marginTop
import kotlinx.css.px
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface DisabledAppState : State {
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
            styledDiv {
                css { marginTop = 20.px }
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
