package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.notification.ArgsProps
import antd.notification.notification
import kotlinext.js.jsObject
import react.RBuilder
import styled.css
import styled.styledDiv

private val openNotification: MouseEventHandler<Any> = {
    val args = jsObject<ArgsProps> {
        message = "Notification Title"
        description = "I will never close automatically. I will be close automatically. I will never close automatically."
        duration = 0
    }

    notification.open(args)
}

fun RBuilder.duration() {
    styledDiv {
        css { +NotificationStyles.duration }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
