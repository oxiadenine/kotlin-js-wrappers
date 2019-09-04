package samples.tabs

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            disabled()
            icon()
            slide()
            extra()
            size()
            position()
            card()
            editableCard()
            cardTop()
            customAddTrigger()
            nest()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
