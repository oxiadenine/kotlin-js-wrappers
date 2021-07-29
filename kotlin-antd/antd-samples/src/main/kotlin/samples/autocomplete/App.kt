package samples.autocomplete

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object AutoCompleteStyles : StyleSheet("auto-complete", isStatic = true) {
    val container by css {}
    val basic by css {}
    val custom by css {}
    val options by css {}
    val nonCaseSensitive by css {}
}

class AutoCompleteApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"AutoComplete" }
        styledDiv {
            css { +AutoCompleteStyles.container }
            basic()
            custom()
            options()
            nonCaseSensitive()
        }
    }
}

fun RBuilder.autoCompleteApp() = child(AutoCompleteApp::class) {}
