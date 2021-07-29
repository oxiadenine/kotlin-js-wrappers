package samples.anchor

import kotlinx.css.zIndex
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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

class AnchorApp : RComponent<RProps, State>() {
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
