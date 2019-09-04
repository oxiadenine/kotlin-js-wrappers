package samples.inputnumber

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            disabled()
            formatter()
            size()
            digit()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
