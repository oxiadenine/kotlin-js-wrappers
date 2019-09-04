package samples.progress

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
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

fun RBuilder.app() = child(App::class) {}
