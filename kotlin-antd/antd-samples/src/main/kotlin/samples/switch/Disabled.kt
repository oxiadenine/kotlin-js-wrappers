package samples.switch

import antd.MouseEventHandler
import antd.button.button
import antd.switch.switch
import kotlinx.html.id
import react.*
import react.dom.*

interface DisabledAppState : RState {
    var disabled: Boolean
}

class DisabledApp : RComponent<RProps, DisabledAppState>() {
    private val toggle: MouseEventHandler<Any> =  {
        setState {
            disabled = !state.disabled
        }
    }

    override fun DisabledAppState.init() {
        disabled = true
    }

    override fun RBuilder.render() {
        div {
            switch {
                attrs {
                    disabled = state.disabled
                    defaultChecked = true
                }
            }
            br {}
            button {
                attrs {
                    type = "primary"
                    onClick = toggle
                }
                +"Toggle disabled"
            }
        }
    }
}

fun RBuilder.disabledApp() = child(DisabledApp::class) {}

fun RBuilder.disabled() {
    div("switch-container") {
        attrs.id = "switch-disabled"
        disabledApp()
    }
}
