package samples.checkbox

import react.*
import react.dom.*

class CheckboxApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Checkbox" }
        div {
            basic()
            controller()
            checkAll()
            disabled()
            group()
            layout()
        }
    }
}

fun RBuilder.checkboxApp() = child(CheckboxApp::class) {}
