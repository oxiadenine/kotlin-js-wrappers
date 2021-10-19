package samples.dropdown

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object DropdownStyles : StyleSheet("dropdown", isStatic = true) {
    val container by css {}
    val basic by css {}
    val item by css {}
    val event by css {}
    val subMenu by css {}
    val contextMenu by css {}
    val placement by css {}
    val trigger by css {}
    val dropdownButton by css {}
    val overlayVisible by css {}
}

class DropdownApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Dropdown" }
        styledDiv {
            css { +DropdownStyles.container }
            basic()
            item()
            event()
            subMenu()
            contextMenu()
            placement()
            trigger()
            dropdownButton()
            overlayVisible()
        }
    }
}

fun RBuilder.dropdownApp() = child(DropdownApp::class) {}
