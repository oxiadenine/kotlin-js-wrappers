package samples.inputnumber

import react.*
import react.dom.*

class InputNumberApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"InputNumber" }
        div {
            basic()
            disabled()
            formatter()
            size()
            digit()
        }
    }
}

fun RBuilder.inputNumberApp() = child(InputNumberApp::class) {}
