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
        onClick = {
            console.log("Notification Clicked!")
        }
    })
}

fun RBuilder.basic() {
    styledDiv {
        css { +NotificationStyles.basic }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
