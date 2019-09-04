package samples.menu

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            horizontal()
            inline()
            inlineCollapsed()
            siderCurrent()
            vertical()
            theme()
            switchMode()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
