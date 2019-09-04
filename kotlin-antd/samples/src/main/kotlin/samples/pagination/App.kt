package samples.pagination

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            more()
            changer()
            jump()
            mini()
            simple()
            controlled()
            total()
            itemRender()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
