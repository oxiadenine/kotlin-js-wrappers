package samples.dropdown

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            item()
            event()
            subMenu()
            contextMenu()
            placement()
            trigger()
            dropdownButton()
            overlayVisible()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
