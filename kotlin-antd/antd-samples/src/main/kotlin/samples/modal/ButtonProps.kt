package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.modal
import kotlinext.js.jsObject
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*

interface ButtonPropsAppState : RState {
    var visible: Boolean
}

class ButtonPropsApp : RComponent<RProps, ButtonPropsAppState>() {
    private val showModal: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val handleOk: (e: MouseEvent<HTMLElement>) -> Unit = {
        console.log(it)

        setState {
            visible = false
        }
    }

    private val handleCancel: (e: MouseEvent<HTMLElement>) -> Unit = {
        console.log(it)

        setState {
            visible = false
        }
    }

    override fun ButtonPropsAppState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showModal
                }
                +"Open Modal with customized button props"
            }
            modal {
                attrs {
                    title = "Basic Modal"
                    visible = state.visible
                    onOk = handleOk
                    onCancel = handleCancel
                    okButtonProps= jsObject { disabled = true }
                    cancelButtonProps= jsObject { disabled = true }
                }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
            }
        }
    }
}

fun RBuilder.buttonPropsApp() = child(ButtonPropsApp::class) {}

fun RBuilder.buttonProps() {
    div("modal-container") {
        attrs.id = "modal-button-props"
        buttonPropsApp()
    }
}
