package samples.grid

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            gutter()
            offset()
            sort()
            flex()
            flexAlign()
            flexOrder()
            responsive()
            responsiveMore()
            playground()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
