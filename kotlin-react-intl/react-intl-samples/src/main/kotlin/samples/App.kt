package samples

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h1
import samples.advanced.advanced

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("app-header") {
            h1 { +"Examples" }
        }
        div("app-content") {
            timeZone()
            messages()
            injected()
            hooks()
            handleChange()
            advanced()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
