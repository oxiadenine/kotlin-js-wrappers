package samples.notification

import antd.MouseEventHandler
import antd.button.button
import antd.notification.notification
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import kotlin.browser.window

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
    div("notification-container") {
        attrs.id = "notification-update"
        button {
            attrs {
                type = "primary"
                onClick = openNotification
            }
            +"Open the notification box"
        }
    }
}
