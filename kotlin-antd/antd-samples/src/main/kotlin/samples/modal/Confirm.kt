package samples.modal

import antd.MouseEventHandler
import antd.button.button
import antd.modal.ModalComponent
import kotlinext.js.jso
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv
import kotlin.js.Promise

private val showConfirm: MouseEventHandler<Any> = {
    ModalComponent.confirm(jso {
        title = "Do you want to delete these items?"
        content = "Some descriptions"
        onOk = {
            console.log("OK")

            Promise.resolve(true)
        }
        onCancel = {
            console.log("Cancel")

            Promise.resolve(false)
        }
    })
}

private val showDeleteConfirm: MouseEventHandler<Any> = {
    ModalComponent.confirm(jso {
        title = "Are you sure delete this task?"
        content = "Some descriptions"
        okText = "Yes"
        okType = "danger"
        cancelText = "No"
        onOk = {
            console.log("OK")

            Promise.resolve(true)
        }
        onCancel = {
            console.log("Cancel")

            Promise.resolve(false)
        }
    })
}

private val showPropsConfirm: MouseEventHandler<Any> = {
    ModalComponent.confirm(jso {
        title = "Are you sure delete this task?"
        content = "Some descriptions"
        okText = "Yes"
        okType = "danger"
        maskClosable = true
        okButtonProps = jso { disabled = true }
        cancelButtonProps = jso { loading = true }
        cancelText = "No"
        onOk = { console.log("OK") }
        onCancel = { console.log("Cancel") }
    })
}

fun RBuilder.confirm() {
    styledDiv {
        css { +ModalStyles.confirm }
        div {
            button {
                attrs.onClick = showConfirm
                +"Confirm"
            }
            button {
                attrs {
                    onClick = showDeleteConfirm
                    type = "dashed"
                }
                +"Delete"
            }
            button {
                attrs {
                    onClick = showPropsConfirm
                    type = "dashed"
                }
                +"With extra props"
            }
        }
    }
}
