package samples.switch

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

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

class SwitchApp : RComponent<RProps, RState>() {
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
