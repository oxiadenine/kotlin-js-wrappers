package samples.collapse

import react.*
import react.dom.*

class CollapseApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Collapse" }
        div {
            basic()
            accordion()
            mix()
            borderless()
            custom()
            noarrow()
            extra()
        }
    }
}

fun RBuilder.collapseApp() = child(CollapseApp::class) {}
