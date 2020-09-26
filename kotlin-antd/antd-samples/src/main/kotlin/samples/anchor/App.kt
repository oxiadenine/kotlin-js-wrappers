package samples.anchor

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object AnchorStyles : StyleSheet("anchor", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants(".code-box-demo") {
            descendants(".ant-affix") {
                zIndex = 1
            }
        }
    }
    val onClick by css {}
    val static by css {}
}

class AnchorApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Anchor" }
        styledDiv {
            css { +AnchorStyles.container }
            basic()
            onClick()
            static()
        }
    }
}

fun RBuilder.anchorApp() = child(AnchorApp::class) {}
