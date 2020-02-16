package samples.autocomplete

import react.*
import react.dom.*

class AutoCompleteApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"AutoComplete" }
        div {
            basic()
            custom()
            options()
            nonCaseSensitive()
        }
    }
}

fun RBuilder.autoCompleteApp() = child(AutoCompleteApp::class) {}
