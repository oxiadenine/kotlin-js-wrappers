package samples.alert

import antd.alert.alert
import react.*
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

external interface SmoothClosedState : State {
    var visible: Boolean
}

class SmoothClosedApp : RComponent<Props, SmoothClosedState>() {
    private val handleClose: () -> Unit = {
        setState {
            visible = false
        }
    }

    override fun SmoothClosedState.init() {
        visible = true
    }

    override fun RBuilder.render() {
        div {
            if (state.visible) {
                alert {
                    attrs {
                        message = "Alert Message Text"
                        type = "success"
                        closable = true
                        afterClose = handleClose
                    }
                }
            }
            p { +"placeholder text here" }
        }
    }
}

fun RBuilder.smoothClosedApp() = child(SmoothClosedApp::class) {}

fun RBuilder.smoothClosed() {
    styledDiv {
        css { +AlertStyles.smoothClosed }
        smoothClosedApp()
    }
}
