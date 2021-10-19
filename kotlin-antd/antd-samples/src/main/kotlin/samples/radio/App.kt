package samples.radio

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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

class RadioApp : RComponent<Props, State>() {
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
