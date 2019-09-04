package samples.alert

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            closable()
            icon()
            banner()
            style()
            description()
            closeText()
            smoothClosed()
            customIcon()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
