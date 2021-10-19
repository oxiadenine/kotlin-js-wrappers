package samples.popover

import antd.button.button
import antd.popover.popover
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.*
import react.dom.a
import styled.css
import styled.styledDiv

external interface ControlAppState : State {
    var visible: Boolean
}

class ControlApp : RComponent<Props, ControlAppState>() {
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
