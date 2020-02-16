package samples.anchor

import react.*
import react.dom.*

class AnchorApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Anchor" }
        div {
            basic()
            onClick()
            static()
        }
    }
}

fun RBuilder.anchorApp() = child(AnchorApp::class) {}
