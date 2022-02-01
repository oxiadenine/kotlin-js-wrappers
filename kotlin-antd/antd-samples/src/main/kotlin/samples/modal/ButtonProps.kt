package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.modal
import kotlinext.js.jso
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

external interface ButtonPropsAppState : State {
    var visible: Boolean
}

class ButtonPropsApp : RComponent<Props, ButtonPropsAppState>() {
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
                    okButtonProps = jso { disabled = true }
                    cancelButtonProps = jso { disabled = true }
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
    styledDiv {
        css { +ModalStyles.butonProps }
        buttonPropsApp()
    }
}
