package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import kotlinx.html.id
import react.*
import react.dom.*

private val success: MouseEventHandler<Any> = {
    message.loading("Action in progress..", 2.5).promise
            .then { message.success("Loading finished", 2.5) }
            .then { message.info("Loading finished is finished", 2.5) }
}

fun RBuilder.thenable() {
    div("message-container") {
        attrs.id = "message-thenable"
        button {
            attrs.onClick = success
            +"Display a sequence of message"
        }
    }
}
