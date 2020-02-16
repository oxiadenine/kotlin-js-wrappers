package samples.input

import react.*
import react.dom.*

class InputApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Input" }
        div {
            basic()
            addon()
            searchInput()
            autosizeTextarea()
            presuffix()
            allowClear()
            size()
            group()
            textarea()
            passwordInput()
            textareaResize()
        }
    }
}

fun RBuilder.inputApp() = child(InputApp::class) {}
