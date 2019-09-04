package samples.radio

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            basic()
            radioGroup()
            radioGroupOptions()
            radioGroupWithName()
            radioButtonSolid()
            disabled()
            radioGroupMore()
            radioButton()
            size()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
