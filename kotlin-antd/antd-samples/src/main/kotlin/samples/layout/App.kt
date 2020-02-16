package samples.layout

import react.*
import react.dom.*

class LayoutApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Layout" }
        div {
            basic()
            top()
            topSide2()
            topSide()
            side()
            customTrigger()
            responsive()
            fixed()
            fixedSider()
        }
    }
}

fun RBuilder.layoutApp() = child(LayoutApp::class) {}
