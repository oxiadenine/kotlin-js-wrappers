package samples.modal

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            footer()
            confirmPromise()
            locale()
            position()
            async()
            confirm()
            info()
            manual()
            buttonProps()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
