package samples.avatar

import kotlinx.css.marginRight
import kotlinx.css.marginTop
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
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
    val fallback by css {}
    val group by css {}
    val responsive by css {}
}

class AvatarApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Avatar" }
        styledDiv {
            css { +AvatarStyles.container }
            basic()
            dynamic()
            type()
            badge()
            toggleDebug()
            fallback()
            group()
            responsive()
        }
    }
}

fun RBuilder.avatarApp() = child(AvatarApp::class) {}
