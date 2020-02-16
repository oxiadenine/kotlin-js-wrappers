package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import antd.modal.modal
import kotlinext.js.jsObject
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*

interface LocalizedModalState : RState {
    var visible: Boolean
}

class LocalizedModal : RComponent<RProps, LocalizedModalState>() {
    private val showModal: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val hideModal: (e: MouseEvent<HTMLElement>) -> Unit = {
        setState {
            visible = false
        }
    }

    override fun LocalizedModalState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showModal
                }
                +"Modal"
            }
            modal {
                attrs {
                    title = "Modal"
                    visible = state.visible
                    onOk = hideModal
                    onCancel = hideModal
                    okText = "确认"
                    cancelText = "取消"
                }
                p { +"Bla bla ..." }
                p { +"Bla bla ..." }
                p { +"Bla bla ..." }
            }
        }
    }
}

fun RBuilder.localizedModal() = child(LocalizedModal::class) {}

private val confirmModal: MouseEventHandler<Any> = {
    ModalComponent.confirm(jsObject {
        title = "Confirm"
        content = "Bla bla ..."
        okText = "确认"
        cancelText = "取消"
    })
}

fun RBuilder.locale() {
    div("modal-container") {
        attrs.id = "modal-locale"
        div {
            localizedModal()
            br {}
            button {
                attrs.onClick = confirmModal
                +"Confirm"
            }
        }
    }
}
