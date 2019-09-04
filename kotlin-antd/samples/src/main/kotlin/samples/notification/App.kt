package samples.notification

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            withIcon()
            customIcon()
            customStyle()
            duration()
            withBtn()
            placement()
            update()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
