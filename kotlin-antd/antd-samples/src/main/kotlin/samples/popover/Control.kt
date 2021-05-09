package samples.popover

import antd.button.button
import antd.popover.*
import kotlinx.html.js.*
import org.w3c.dom.events.*
import react.*
import react.dom.*
import styled.*

external interface ControlAppState : RState {
    var visible: Boolean
}

class ControlApp : RComponent<RProps, ControlAppState>() {
    private val hide = fun(_: Event) {
        setState {
            visible = false
        }
    }

    private val handleVisibleChange = fun(visibleFlag: Boolean) {
        setState {
            visible = visibleFlag
        }
    }

    override fun ControlAppState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        popover {
            attrs {
                content = buildElement {
                    a {
                        attrs.onClickFunction = hide
                        +"Close"
                    }
                }
                title = "Title"
                trigger = "click"
                visible = state.visible
                onVisibleChange = handleVisibleChange
            }
            button {
                attrs.type = "primary"
                +"Click me"
            }
        }
    }
}

fun RBuilder.controlApp() = child(ControlApp::class) {}

fun RBuilder.control() {
    styledDiv {
        css { +PopoverStyles.control }
        controlApp()
    }
}
