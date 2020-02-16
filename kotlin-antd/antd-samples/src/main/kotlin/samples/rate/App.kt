package samples.rate

import react.*
import react.dom.*

class RateApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Rate" }
        div {
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
