package samples.dropdown

import react.*
import react.dom.*
import styled.*

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

class DropdownApp : RComponent<RProps, RState>() {
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
