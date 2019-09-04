package samples.result

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            customIcon()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
