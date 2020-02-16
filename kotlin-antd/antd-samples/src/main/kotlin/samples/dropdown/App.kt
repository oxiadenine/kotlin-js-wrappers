package samples.dropdown

import react.*
import react.dom.*

class DropdownApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Dropdown" }
        div {
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
