package samples.card

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            borderLess()
            simple()
            flexibleContent()
            inColumn()
            loading()
            gridCard()
            inner()
            tabs()
            meta()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
