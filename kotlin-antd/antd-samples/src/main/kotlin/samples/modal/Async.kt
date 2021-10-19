package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.modal
import kotlinx.browser.window
import org.w3c.dom.HTMLElement
import react.*
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

external interface AsyncAppState : State {
    var modalText: String
    var visible: Boolean
    var confirmLoading: Boolean
}

class AsyncApp : RComponent<Props, AsyncAppState>() {
    private val showModal: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val handleOk: (e: MouseEvent<HTMLElement>) -> Unit = {
        setState {
            modalText = "The modal will be closed after two seconds"
            confirmLoading = true
        }

        window.setTimeout({
            setState {
                visible = false
                confirmLoading = false
            }
        }, 2000)
    }

    private val handleCancel: (e: MouseEvent<HTMLElement>) -> Unit = {
        console.log("Clicked cancel button")

        setState {
            visible = false
        }
    }

    override fun AsyncAppState.init() {
        modalText = "Content of the modal"
        visible = false
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showModal
                }
                +"Open Modal with async logic"
            }
            modal {
                attrs {
                    title = "Title"
                    visible = state.visible
                    onOk = handleOk
                    confirmLoading = state.confirmLoading
                    onCancel = handleCancel
                }
                p { +state.modalText }
            }
        }
    }
}

fun RBuilder.asyncApp() = child(AsyncApp::class) {}

fun RBuilder.async() {
    styledDiv {
        css { +ModalStyles.async }
        asyncApp()
    }
}
