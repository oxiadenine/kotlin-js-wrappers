package samples.rate

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            text()
            clear()
            half()
            disabled()
            character()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
