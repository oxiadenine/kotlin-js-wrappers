package samples.alert

import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object AlertStyles : StyleSheet("alert", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants(".ant-alert") {
            marginBottom = 16.px
        }
    }
    val closable by css {}
    val icon by css {}
    val banner by css {}
    val style by css {}
    val description by css {}
    val closeText by css {}
    val smoothClosed by css {}
    val customIcon by css {}
    val errorBoundary by css {}
}

class AlertApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Alert" }
        styledDiv {
            css { +AlertStyles.container }
            basic()
            closable()
            icon()
            banner()
            style()
            description()
            closeText()
            smoothClosed()
            customIcon()
            errorBoundary()
        }
    }
}

fun RBuilder.alertApp() = child(AlertApp::class) {}
