package samples.notification

import antd.button.button
import antd.notification.ArgsProps
import antd.notification.notification
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val openNotificationWithIcon: (String) -> Unit = { type ->
    notification.asDynamic()[type](jsObject<ArgsProps> {
        message = "Notification Title"
        description = "This is the content of the notification. This is the content of the notification. This is the content of the notification."
    }).unsafeCast<Function<Unit>>()
}

fun RBuilder.withIcon() {
    div("notification-container") {
        attrs.id = "notification-with-icon"
        div {
            button {
                attrs.onClick = { openNotificationWithIcon("success") }
                +"Success"
            }
            button {
                attrs.onClick = { openNotificationWithIcon("info") }
                +"Info"
            }
            button {
                attrs.onClick = { openNotificationWithIcon("warning") }
                +"Warning"
            }
            button {
                attrs.onClick = { openNotificationWithIcon("error") }
                +"Error"
            }
        }
    }
}
