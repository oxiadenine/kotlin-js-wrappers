package samples.message

import antd.MouseEventHandler
import antd.button.button
import antd.message.message
import kotlinx.html.id
import react.*
import react.dom.*

private val info: MouseEventHandler<Any> = {
    message.info("This is a normal message")
}

fun RBuilder.info() {
    div("message-container") {
        attrs.id = "message-info"
        button {
            attrs {
                type = "primary"
                onClick = info
            }
            +"Display normal message"
        }
    }
}
