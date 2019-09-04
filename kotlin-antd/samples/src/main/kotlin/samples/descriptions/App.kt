package samples.descriptions

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            border()
            size()
            responsive()
            vertical()
            verticalBorder()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
