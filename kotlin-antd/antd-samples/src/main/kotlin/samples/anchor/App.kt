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
    val targetOffset by css {}
    val static by css {}
    val onChange by css {}

}

class AnchorApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Anchor" }
        styledDiv {
            css { +AnchorStyles.container }
            basic()
            onClick()
            targetOffset()
            static()
            onChange()
        }
    }
}

fun RBuilder.anchorApp() = child(AnchorApp::class) {}
