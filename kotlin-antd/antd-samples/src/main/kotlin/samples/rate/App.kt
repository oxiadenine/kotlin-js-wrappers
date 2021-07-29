package samples.rate

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object RateStyles : StyleSheet("rate", isStatic = true) {
    val container by css {}
    val basic by css {}
    val text by css {}
    val clear by css {}
    val half by css {}
    val disabled by css {}
    val character by css {}
}

class RateApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Rate" }
        styledDiv {
            css { +RateStyles.container }
            basic()
            text()
            clear()
            half()
            disabled()
            character()
        }
    }
}

fun RBuilder.rateApp() = child(RateApp::class) {}
