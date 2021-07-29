package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.notification.notification
import kotlinext.js.jsObject
import react.RBuilder
import styled.css
import styled.styledDiv

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
