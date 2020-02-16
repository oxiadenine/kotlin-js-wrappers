package samples.popover

import react.*
import react.dom.*

class PopoverApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Popover" }
        div {
            basic()
            placement()
            arrowPointAtCenter()
            triggerType()
            control()
            hoverWithClick()
        }
    }
}

fun RBuilder.popoverApp() = child(PopoverApp::class) {}
