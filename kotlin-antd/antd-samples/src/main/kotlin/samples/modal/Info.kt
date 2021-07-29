package samples.modal

import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import kotlinext.js.jsObject
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv
import kotlin.js.Promise

private val info: MouseEventHandler<Any> = {
    ModalComponent.info(jsObject {
        title = "This is a notification message"
        content = buildElement {
            div {
                p { +"some messages...some messages..." }
                p { +"some messages...some messages..." }
            }
        }
        onOk = { Promise.resolve(true) }
    })
}

private val success: MouseEventHandler<Any> = {
    ModalComponent.success(jsObject {
        title = "This is a success message"
        content = "some messages...some messages..."
    })
}

private val error: MouseEventHandler<Any> = {
    ModalComponent.error(jsObject {
        title = "This is an error message"
        content = "some messages...some messages..."
    })
}

private val warning: MouseEventHandler<Any> = {
    ModalComponent.warning(jsObject {
        title = "This is a warning message"
        content = "some messages...some messages..."
    })
}

fun RBuilder.info() {
    styledDiv {
        css { +ModalStyles.info }
        div {
            button {
                attrs.onClick = info
                +"Info"
            }
            button {
                attrs.onClick = success
                +"Success"
            }
            button {
                attrs.onClick = error
                +"Error"
            }
            button {
                attrs.onClick = warning
                +"Warning"
            }
        }
    }
}
