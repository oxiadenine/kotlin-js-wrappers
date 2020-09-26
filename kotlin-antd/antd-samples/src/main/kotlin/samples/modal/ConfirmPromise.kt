package samples.modal

import antd.*
import antd.button.button
import antd.modal.*
import kotlinext.js.*
import kotlinx.browser.*
import react.*
import react.dom.*
import styled.*

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

fun RBuilder.confirmPromise() {
    styledDiv {
        css { +ModalStyles.confirmPromise }
        div {
            button {
                attrs.onClick = showConfirm
                +"Confirm"
            }
        }
    }
}
