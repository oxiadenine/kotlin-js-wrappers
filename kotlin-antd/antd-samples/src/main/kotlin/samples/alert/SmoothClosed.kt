package samples.alert

import antd.alert.*
import react.*
import react.dom.*
import styled.*

external interface SmoothClosedState : RState {
    var visible: Boolean
}

class SmoothClosedApp : RComponent<RProps, SmoothClosedState>() {
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
