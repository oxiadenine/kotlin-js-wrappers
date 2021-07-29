package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.icon.smileOutlined
import antd.notification.notification
import kotlinext.js.js
import kotlinext.js.jsObject
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

private val openNotification: MouseEventHandler<Any> = {
    notification.open(jsObject {
        message = "Notification Title"
        description = "This is the content of the notification. This is the content of the notification. This is the content of the notification."
        icon = buildElement {
            smileOutlined {
                attrs.style = js { color = "#108ee9" }
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
