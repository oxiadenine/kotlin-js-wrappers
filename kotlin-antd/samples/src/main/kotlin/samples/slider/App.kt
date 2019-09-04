package samples.slider

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            iconSlider()
            event()
            vertical()
            inputNumber()
            tipFormatter()
            mark()
            showTooltip()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
