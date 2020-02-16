package samples.result

import react.*
import react.dom.*

class ResultApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Result" }
        div {
            basic()
            customIcon()
        }
    }
}

fun RBuilder.resultApp() = child(ResultApp::class) {}
