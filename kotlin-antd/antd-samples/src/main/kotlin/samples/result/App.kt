package samples.result

import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ResultStyles : StyleSheet("result", isStatic = true) {
    val container by css {}
    val basic by css {}
    val customIcon by css {}
}

class ResultApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Result" }
        styledDiv {
            css { +ResultStyles.container }
            basic()
            customIcon()
        }
    }
}

fun RBuilder.resultApp() = child(ResultApp::class) {}
