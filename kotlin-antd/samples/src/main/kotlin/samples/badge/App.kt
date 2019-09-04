package samples.badge

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            overflow()
            link()
            status()
            noWrapper()
            dot()
            change()
            title()
            colorful()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
