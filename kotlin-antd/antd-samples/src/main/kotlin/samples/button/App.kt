package samples.button

import react.*
import react.dom.*

class ButtonApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Button" }
        div {
            basic()
            size()
            loading()
            buttonGroup()
            block()
            icon()
            disabled()
            multiple()
            ghost()
        }
    }
}

fun RBuilder.buttonApp() = child(ButtonApp::class) {}
