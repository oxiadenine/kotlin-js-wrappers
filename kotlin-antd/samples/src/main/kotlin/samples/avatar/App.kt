package samples.avatar

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            dynamic()
            type()
            badge()
            toggleDebug()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
