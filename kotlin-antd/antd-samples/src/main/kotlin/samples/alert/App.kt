package samples.alert

import kotlinx.css.marginBottom
import kotlinx.css.px
import react.*
import react.dom.*
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
}

class AlertApp : RComponent<RProps, RState>() {
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
        }
    }
}

fun RBuilder.alertApp() = child(AlertApp::class) {}
