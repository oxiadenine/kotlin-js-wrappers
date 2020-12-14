package samples.icon

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object IconStyles : StyleSheet("icon", isStatic = true) {
    val container by css {
        descendants(".icons-list") {
            children(".anticon") {
                marginRight = 6.px
                fontSize = 24.px
            }
        }
    }
    val basic by css {}
    val custom by css {
        descendants(".custom-icons-list") {
            children(".anticon") {
                marginRight = 6.px
            }
        }
    }
    val twoTone by css {}
    val iconfont by css {}
    val icons by css {}
    val scriptUrl by css {}
}

class IconApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Icon" }
        styledDiv {
            css { +IconStyles.container }
            basic()
            custom()
            twoTone()
            iconfont()
            scriptUrl()
        }
    }
}

fun RBuilder.iconApp() = child(IconApp::class) {}
