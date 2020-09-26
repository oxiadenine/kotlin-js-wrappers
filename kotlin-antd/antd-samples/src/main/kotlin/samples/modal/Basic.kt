package samples.modal

import antd.MouseEvent
import antd.MouseEventHandler
import antd.button.button
import antd.modal.modal
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

interface BasicAppState : RState {
    var visible: Boolean
}

class BasicApp : RComponent<RProps, BasicAppState>() {
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

    override fun BasicAppState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs {
                    type = "primary"
                    onClick = showModal
                }
                +"Open Modal"
            }
            modal {
                attrs {
                    title = "Basic Modal"
                    visible = state.visible
                    onOk = handleOk
                    onCancel = handleCancel
                }
                p { +"Some contents..." }
                p { +"Some contents..." }
                p { +"Some contents..." }
            }
        }
    }
}

fun RBuilder.basicApp() = child(BasicApp::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +ModalStyles.basic }
        basicApp()
    }
}
