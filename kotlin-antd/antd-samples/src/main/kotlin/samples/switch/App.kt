package samples.switch

import react.*
import react.dom.*

class SwitchApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Switch" }
        div {
            basic()
            text()
            loading()
            disabled()
            size()
        }
    }
}

fun RBuilder.switchApp() = child(SwitchApp::class) {}
