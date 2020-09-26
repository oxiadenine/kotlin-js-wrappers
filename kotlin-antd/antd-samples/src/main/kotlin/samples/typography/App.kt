package samples.typography

import react.*
import react.dom.*
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

class TypographyApp : RComponent<RProps, RState>() {
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
