package samples.divider

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            horizontal()
            withText()
            vertical()
            customizeStyle()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
