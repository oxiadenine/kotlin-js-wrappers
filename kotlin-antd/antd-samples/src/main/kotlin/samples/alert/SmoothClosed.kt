package samples.alert

import antd.alert.alert
import kotlinx.html.id
import react.*
import react.dom.div
import react.dom.p

interface SmoothClosedState : RState {
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
    div("alert-container") {
        attrs.id = "alert-smooth-closed"
        smoothClosedApp()
    }
}
