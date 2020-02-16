package samples.notification

import react.*
import react.dom.*

class NotificationApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Notification" }
        div {
            basic()
            withIcon()
            customIcon()
            customStyle()
            duration()
            withBtn()
            placement()
            update()
        }
    }
}

fun RBuilder.notificationApp() = child(NotificationApp::class) {}
