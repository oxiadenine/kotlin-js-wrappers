package samples.progress

import react.*
import react.dom.*

class ProgressApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Progress" }
        div {
            line()
            lineMini()
            circleDynamic()
            format()
            segment()
            gradientLine()
            circle()
            circleMini()
            dynamic()
            dashboard()
            linecap()
        }
    }
}

fun RBuilder.progressApp() = child(ProgressApp::class) {}
