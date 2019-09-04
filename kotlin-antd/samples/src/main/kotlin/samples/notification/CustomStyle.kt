package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.notification.notification
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val openNotification: MouseEventHandler<Any> = {
    notification.open(jsObject {
        message = "Notification Title"
        description = "This is the content of the notification. This is the content of the notification. This is the content of the notification."
        style = js {
            width = 600
            marginLeft = 335 - 600
        }
    })
}

fun RBuilder.customStyle() {
    div("notification-container") {
        attrs.id = "notification-custom-style"
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
