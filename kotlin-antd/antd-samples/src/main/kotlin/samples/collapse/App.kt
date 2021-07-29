package samples.collapse

import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object CollapseStyles : StyleSheet("collapse", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants("p") {
            margin(0.px)
        }
    }
    val accordion by css {}
    val mix by css {}
    val borderless by css {}
    val custom by css {}
    val noarrow by css {}
    val extra by css {}
}

class CollapseApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Collapse" }
        styledDiv {
            css { +CollapseStyles.container }
            basic()
            accordion()
            mix()
            borderless()
            custom()
            noarrow()
            extra()
        }
    }
}

fun RBuilder.collapseApp() = child(CollapseApp::class) {}
