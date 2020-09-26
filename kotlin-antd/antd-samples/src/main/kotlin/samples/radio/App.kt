package samples.radio

import react.*
import react.dom.*
import styled.*

object RadioStyles : StyleSheet("radio", isStatic = true) {
    val container by css {}
    val basic by css {}
    val radioGroup by css {}
    val radioGroupOptions by css {}
    val radioGroupWithName by css {}
    val radioButtonSolid by css {}
    val disabled by css {}
    val radioGroupMore by css {}
    val radioButton by css {}
    val size by css {}
}

class RadioApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Radio" }
        styledDiv {
            css { +RadioStyles.container }
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

fun RBuilder.radioApp() = child(RadioApp::class) {}
