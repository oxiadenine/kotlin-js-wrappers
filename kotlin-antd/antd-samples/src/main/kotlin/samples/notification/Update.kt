package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.notification.notification
import kotlinext.js.jsObject
import kotlinx.browser.window
import react.RBuilder
import styled.css
import styled.styledDiv

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
