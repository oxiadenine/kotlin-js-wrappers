package samples.steps

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            simple()
            smallSize()
            icon()
            stepNext()
            vertical()
            verticalSmall()
            error()
            progressDot()
            customizedProgressDot()
            clickable()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
