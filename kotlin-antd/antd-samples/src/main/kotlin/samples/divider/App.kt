package samples.divider

import react.*
import react.dom.*

class DividerApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Divider" }
        div {
            horizontal()
            withText()
            vertical()
            customizeStyle()
        }
    }
}

fun RBuilder.dividerApp() = child(DividerApp::class) {}
