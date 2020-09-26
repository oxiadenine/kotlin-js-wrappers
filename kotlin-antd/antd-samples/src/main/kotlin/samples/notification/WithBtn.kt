package samples.notification

import antd.*
import antd.button.*
import antd.notification.*
import kotlinext.js.*
import react.*
import styled.*
import kotlin.js.Date

private val close: () -> Unit = {
    console.log("Notification was closed. Either the close button was clicked or duration time elapsed.")
}

private val openNotification: MouseEventHandler<Any> = {
    val notKey = "open${Date.now()}"
    val notBtn = buildElement {
        button {
            attrs {
                type = "primary"
                size = "small"
                onClick = { notification.close(notKey) }
            }
            +"Confirm"
        }
    }

    notification.open(jsObject {
        message = "Notification Title"
        description = "A function will be be called after the notification is closed (automatically after the \"duration\" time of manually)."
        btn = notBtn
        key = notKey
        onClose = close
    })
}

fun RBuilder.withBtn() {
    styledDiv {
        css { +NotificationStyles.withBtn }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
