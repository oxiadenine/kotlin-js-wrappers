package samples.notification

import antd.button.button
import antd.notification.*
import kotlinext.js.*
import react.*
import react.dom.div
import styled.*

private val openNotificationWithIcon: (String) -> Unit = { type ->
    notification.asDynamic()[type](jsObject<ArgsProps> {
        message = "Notification Title"
        description = "This is the content of the notification. This is the content of the notification. This is the content of the notification."
    }).unsafeCast<Function<Unit>>()
}

fun RBuilder.withIcon() {
    styledDiv {
        css { +NotificationStyles.withIcon }
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
