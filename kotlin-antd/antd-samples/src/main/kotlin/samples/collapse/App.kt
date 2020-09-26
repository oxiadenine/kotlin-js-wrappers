package samples.collapse

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

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

class CollapseApp : RComponent<RProps, RState>() {
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
