package samples.switch

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

object SwitchStyles : StyleSheet("switch", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants(".ant-switch") {
            marginBottom = 8.px
        }
    }
    val text by css {}
    val loading by css {}
    val disabled by css {}
    val size by css {}
}

class SwitchApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Switch" }
        styledDiv {
            css { +SwitchStyles.container }
            basic()
            text()
            loading()
            disabled()
            size()
        }
    }
}

fun RBuilder.switchApp() = child(SwitchApp::class) {}
