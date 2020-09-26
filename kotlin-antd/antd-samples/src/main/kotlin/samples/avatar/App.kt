package samples.avatar

import kotlinx.css.marginRight
import kotlinx.css.marginTop
import kotlinx.css.px
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object AvatarStyles : StyleSheet("avatar", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants(".ant-avatar") {
            marginTop = 16.px
            marginRight = 16.px
        }
    }
    val dynamic by css {}
    val type by css {
        descendants(".ant-avatar") {
            marginTop = 16.px
            marginRight = 16.px
        }
    }
    val badge by css {}
    val toggleDebug by css {}
}

class AvatarApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Avatar" }
        styledDiv {
            css { +AvatarStyles.container }
            basic()
            dynamic()
            type()
            badge()
            toggleDebug()
        }
    }
}

fun RBuilder.avatarApp() = child(AvatarApp::class) {}
