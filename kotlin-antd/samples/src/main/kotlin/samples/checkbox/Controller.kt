package samples.checkbox

import antd.MouseEventHandler
import antd.button.button
import antd.checkbox.CheckboxChangeEvent
import antd.checkbox.checkbox
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface ControllerAppState : RState {
    var checked: Boolean
    var disabled: Boolean
}

class ControllerApp : RComponent<RProps, ControllerAppState>() {
    private val toggleChecked: MouseEventHandler<Any> =  {
        setState {
            checked = !state.checked
        }
    }

    private val toggleDisable: MouseEventHandler<Any> = {
        setState {
            disabled = !state.disabled
        }
    }

    val handleChange = fun (event: CheckboxChangeEvent) {
        console.log("checked = ${event.target.checked}")

        setState {
            checked = event.target.checked!!
        }
    }

    override fun ControllerAppState.init() {
        checked = true
        disabled = false
    }

    override fun RBuilder.render() {
        val label = "${if (state.checked) "Checked" else "Unchecked"} - ${if (state.disabled) "Disabled" else "Enabled"}"

        div {
            p {
                attrs.jsStyle = js { marginBottom = "20px" }
                checkbox {
                    attrs {
                        checked = state.checked
                        disabled = state.disabled
                        onChange = handleChange
                    }
                    +label
                }
            }
            p("checkbox-paragraph") {
                button {
                    attrs {
                        type = "primary"
                        size = "small"
                        onClick = toggleChecked
                    }
                    +if (!state.checked) "Check" else "Uncheck"
                }
                button {
                    attrs {
                        style = js { marginLeft = "10px" }
                        type = "primary"
                        size = "small"
                        onClick = toggleDisable
                    }
                    +if (!state.disabled) "Disable" else "Enable"
                }
            }
        }
    }
}

fun RBuilder.controllerApp() = child(ControllerApp::class) {}

fun RBuilder.controller() {
    div("checkbox-container") {
        attrs.id = "checkbox-controller"
        controllerApp()
    }
}
