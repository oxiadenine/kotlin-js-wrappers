package samples.tree

import react.*
import react.dom.*

class TreeApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Tree" }
        div {
            basic()
            customizedIcon()
            basicControlled()
            dynamic()
            line()
            directory()
        }
    }
}

fun RBuilder.treeApp() = child(TreeApp::class) {}
