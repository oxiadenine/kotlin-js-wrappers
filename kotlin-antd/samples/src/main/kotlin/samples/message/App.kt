package samples.message

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            info()
            duration()
            thenable()
            other()
            loading()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
