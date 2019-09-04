package samples.tree

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            customizedIcon()
            basicControlled()
            dynamic()
            line()
            directory()
        }
    }
}

fun RBuilder.app() = child(App::class) { }
