package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import kotlinx.html.id
import react.*
import react.dom.*

private val success: MouseEventHandler<Any> = {
    message.success("This is a prompt message for success, and it will disappear in 10 seconds", 10)
}

fun RBuilder.duration() {
    div("message-container") {
        attrs.id = "message-duration"
        button {
            attrs.onClick = success
            +"Customized display duration"
        }
    }
}
