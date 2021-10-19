package samples.typography

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TypographyStyles : StyleSheet("typography", isStatic = true) {
    val container by css {}
    val basic by css {}
    val title by css {}
    val text by css {}
    val interactive by css {}
    val ellipsis by css {}
}

class TypographyApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Typography" }
        styledDiv {
            css { +TypographyStyles.container }
            basic()
            title()
            text()
            interactive()
            ellipsis()
        }
    }
}

fun RBuilder.typographyApp() = child(TypographyApp::class) {}
