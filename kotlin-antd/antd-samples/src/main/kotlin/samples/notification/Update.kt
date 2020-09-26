package samples.notification

import antd.*
import antd.button.*
import antd.notification.*
import kotlinext.js.*
import kotlinx.browser.*
import react.*
import styled.*

private val notKey = "updatable"

private val openNotification: MouseEventHandler<Any> = {
    notification.open(jsObject {
        key = notKey
        message = "Notification Title"
        description = "description."
    })

    window.setTimeout({
        notification.open(jsObject {
            key = notKey
            message = "New Title"
            description = "New description."
        })
    }, 1000)
}

fun RBuilder.update() {
    styledDiv {
        css { +NotificationStyles.update }
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
