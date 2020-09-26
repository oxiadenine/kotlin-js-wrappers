package samples.notification

import antd.*
import antd.button.*
import antd.notification.*
import kotlinext.js.*
import react.*
import styled.*

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
