package samples.result

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ResultStyles : StyleSheet("result", isStatic = true) {
    val container by css {}
    val basic by css {}
    val customIcon by css {}
}

class ResultApp : RComponent<RProps, State>() {
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
