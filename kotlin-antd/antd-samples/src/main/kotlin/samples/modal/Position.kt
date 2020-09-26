package samples.modal

import antd.button.button
import antd.modal.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface PositionAppState : RState {
    var modal1Visible: Boolean
    var modal2Visible: Boolean
}

class PositionApp : RComponent<RProps, PositionAppState>() {
    private fun setModal1Visible(visible: Boolean) {
        setState {
            modal1Visible = visible
        }
    }

    private fun setModal2Visible(visible: Boolean) {
        setState {
            modal2Visible = visible
        }
    }

    override fun PositionAppState.init() {
        modal1Visible = false
        modal2Visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = { setModal1Visible(true) }
                }
                +"Display a modal dialog at 20px to Top"
            }
            modal {
                attrs {
                    title = "20px to Top"
                    style = js { top = 20 }
                    visible = state.modal1Visible
                    onOk = { setModal1Visible(false) }
                    onCancel = { setModal1Visible(false) }
                }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
            }
            br {}
            br {}
            button {
                attrs {
                    type = "primary"
                    onClick = { setModal2Visible(true) }
                }
                +"Vertically centered modal dialog"
            }
            modal {
                attrs {
                    title = "Vertically centered modal dialog"
                    centered = true
                    visible = state.modal2Visible
                    onOk = { setModal2Visible(false) }
                    onCancel = { setModal2Visible(false) }
                }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
            }
        }
    }
}

fun RBuilder.positionApp() = child(PositionApp::class) {}

fun RBuilder.position() {
    styledDiv {
        css { +ModalStyles.position }
        positionApp()
    }
}
