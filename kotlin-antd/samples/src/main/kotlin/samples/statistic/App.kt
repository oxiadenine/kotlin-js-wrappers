package samples.statistic

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            card()
            unit()
            countdown()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
