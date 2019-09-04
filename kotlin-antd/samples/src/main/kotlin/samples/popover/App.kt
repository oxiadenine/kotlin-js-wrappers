package samples.popover

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            placement()
            arrowPointAtCenter()
            triggerType()
            control()
            hoverWithClick()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
