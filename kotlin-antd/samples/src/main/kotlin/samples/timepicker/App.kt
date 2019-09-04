package samples.timepicker

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            size()
            hideColumn()
            addon()
            value()
            disabled()
            intervalOptions()
            hours12()
            suffix()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
