package samples.notification

import antd.*
import antd.button.*
import antd.notification.*
import kotlinext.js.*
import react.*
import styled.*

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
    styledDiv {
        css { +NotificationStyles.customStyle }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
