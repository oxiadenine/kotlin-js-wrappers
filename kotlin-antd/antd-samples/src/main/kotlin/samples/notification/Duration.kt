package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.notification.ArgsProps
import antd.notification.notification
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val openNotification: MouseEventHandler<Any> = {
    val args = jsObject<ArgsProps> {
        message = "Notification Title"
        description = "I will never close automatically. I will be close automatically. I will never close automatically."
        duration = 0
    }

    notification.open(args)
}

fun RBuilder.duration() {
    div("notification-container") {
        attrs.id = "notification-duration"
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
