package samples.icon

import kotlinx.css.fontSize
import kotlinx.css.marginRight
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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

class IconApp : RComponent<Props, State>() {
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
