package samples.notification

import antd.*
import antd.button.*
import antd.icon.*
import antd.notification.*
import kotlinext.js.*
import react.*
import styled.*

private val openNotification: MouseEventHandler<Any> = {
    notification.open(jsObject {
        message = "Notification Title"
        description = "This is the content of the notification. This is the content of the notification. This is the content of the notification."
        icon = buildElement {
            icon {
                attrs {
                    type = "smile"
                    style = js { color = "#108ee9" }
                }
            }
        }
    })
}

fun RBuilder.customIcon() {
    styledDiv {
        css { +NotificationStyles.customIcon }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
