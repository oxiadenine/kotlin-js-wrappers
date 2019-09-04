package samples.popconfirm

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
            icon()
            locale()
            dynamicTrigger()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
