package samples.affix

import kotlinx.css.Image
import kotlinx.css.Overflow
import kotlinx.css.backgroundImage
import kotlinx.css.height
import kotlinx.css.overflowY
import kotlinx.css.paddingTop
import kotlinx.css.px
import react.*
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object AffixStyles : StyleSheet("affix", isStatic = true) {
    val container by css {}
    val basic by css {}
    val onChange by css {}
    val target by css {
        descendants(".scrollable-container") {
            height = 100.px
            overflowY = Overflow.scroll
        }
        descendants(".background") {
            height = 100.px
            paddingTop = 60.px
            backgroundImage = Image("url(https://zos.alipayobjects.com/rmsportal/RmjwQiJorKyobvI.jpg)")
        }
    }
}

class AffixApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Affix" }
        styledDiv {
            css { +AffixStyles.container }
            basic()
            onChange()
            target()
        }
    }
}

fun RBuilder.affixApp() = child(AffixApp::class) {}
