package samples.tag

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            control()
            hotTags()
            colorful()
            checkable()
            controlled()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
