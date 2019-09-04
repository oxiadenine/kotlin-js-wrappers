package samples.input

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            addon()
            searchInput()
            autosizeTextarea()
            presuffix()
            allowClear()
            size()
            group()
            textarea()
            passwordInput()
            textareaResize()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
