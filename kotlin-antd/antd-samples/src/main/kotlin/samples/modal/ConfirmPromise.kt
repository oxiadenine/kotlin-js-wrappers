package samples.modal

import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*
import kotlinx.browser.window

private val destroyAll: MouseEventHandler<Any> = {
    ModalComponent.destroyAll()
}

private val showConfirm: MouseEventHandler<Any> = {
    for (i in 0 until 3) {
        window.setTimeout({
            ModalComponent.confirm(jsObject {
                content = buildElement {
                    button {
                        attrs.onClick = destroyAll
                        +"Click to destroy all"
                    }
                }
                onOk = { console.log("OK") }
                onCancel = { console.log("Cancel") }
            })
        }, i * 500)
    }
}

fun RBuilder.confirmRouter() {
    div("modal-container") {
        attrs.id = "modal-confirm-router"
        div {
            button {
                attrs.onClick = showConfirm
                +"Confirm"
            }
        }
    }
}
