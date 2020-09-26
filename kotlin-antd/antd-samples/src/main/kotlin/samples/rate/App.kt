package samples.rate

import react.*
import react.dom.*
import styled.*

object RateStyles : StyleSheet("rate", isStatic = true) {
    val container by css {}
    val basic by css {}
    val text by css {}
    val clear by css {}
    val half by css {}
    val disabled by css {}
    val character by css {}
}

class RateApp : RComponent<RProps, RState>() {
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
