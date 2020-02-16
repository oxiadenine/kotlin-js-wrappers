package samples.radio

import react.*
import react.dom.*

class RadioApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Radio" }
        div{
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
