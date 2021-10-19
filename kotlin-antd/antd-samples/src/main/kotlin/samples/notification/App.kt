package samples.notification

import kotlinx.css.em
import kotlinx.css.marginRight
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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
    val hooks by css {}
}

class NotificationApp : RComponent<Props, State>() {
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
            hooks()
        }
    }
}

fun RBuilder.notificationApp() = child(NotificationApp::class) {}
