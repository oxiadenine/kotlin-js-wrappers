package samples.timepicker

import antd.MouseEventHandler
import antd.button.button
import antd.timepicker.timePicker
import kotlinx.html.id
import react.*
import react.dom.*

interface AddonDemoState : RState {
    var open: Boolean
}

class AddonDemo : RComponent<RProps, AddonDemoState>() {
    private val handleOpenChange = fun (openFlag: Boolean) {
        setState {
            open = openFlag
        }
    }

    private val handleClose: MouseEventHandler<Any> = {
        setState {
            open = false
        }
    }

    override fun AddonDemoState.init() {
        open = false
    }

    override fun RBuilder.render() {
        timePicker {
            attrs {
                open = state.open
                onOpenChange = handleOpenChange
                addon = {
                    button {
                        attrs {
                            size = "small"
                            type = "primary"
                            onClick = handleClose
                        }
                        +"Ok"
                    }
                }
            }
        }
    }
}

fun RBuilder.addonDemo() = child(AddonDemo::class) {}

fun RBuilder.addon() {
    div("time-picker-container") {
        attrs.id = "time-picker-addon"
        addonDemo()
    }
}
