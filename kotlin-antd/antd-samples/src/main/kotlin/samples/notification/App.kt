package samples.notification

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object NotificationStyles : StyleSheet("notification", isStatic = true) {
    val container by css {}
    val basic by css {}
    val withIcon by css {
        descendants(".ant-btn") {
            marginRight = 1.em
        }
    }
    val customIcon by css {}
    val customStyle by css {}
    val duration by css {}
    val withBtn by css {}
    val placement by css {}
    val update by css {}
}

class NotificationApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Notification" }
        styledDiv {
            css { +NotificationStyles.container }
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
