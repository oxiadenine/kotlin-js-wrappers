package samples.divider

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object DividerStyles : StyleSheet("divider", isStatic = true) {
    val container by css {}
    val horizontal by css {}
    val withText by css {}
    val vertical by css {}
    val customizeStyle by css {}
    val plain by css {}
}

class DividerApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Divider" }
        styledDiv {
            css { +DividerStyles.container }
            horizontal()
            withText()
            vertical()
            customizeStyle()
            plain()
        }
    }
}

fun RBuilder.dividerApp() = child(DividerApp::class) {}
