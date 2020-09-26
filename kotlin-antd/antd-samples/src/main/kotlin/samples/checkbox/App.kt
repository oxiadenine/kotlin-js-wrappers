package samples.checkbox

import react.*
import react.dom.*
import styled.*

object CheckboxStyles : StyleSheet("checkbox", isStatic = true) {
    val container by css {}
    val basic by css {}
    val controller by css {}
    val checkAll by css {}
    val disabled by css {}
    val group by css {}
    val layout by css {}
}

class CheckboxApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Checkbox" }
        styledDiv {
            css { +CheckboxStyles.container }
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
