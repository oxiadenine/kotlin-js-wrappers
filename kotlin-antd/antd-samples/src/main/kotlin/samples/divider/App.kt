package samples.divider

import react.*
import react.dom.*
import styled.*

object DividerStyles : StyleSheet("divider", isStatic = true) {
    val container by css {}
    val horizontal by css {}
    val withText by css {}
    val vertical by css {}
    val customizeStyle by css {}
    val plain by css {}
}

class DividerApp : RComponent<RProps, RState>() {
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
