package samples.treeselect

import react.*
import react.dom.*

class TreeSelectApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"TreeSelect" }
        div {
            basic()
            treeData()
            multiple()
            checkable()
            suffix()
        }
    }
}

fun RBuilder.treeSelectApp() = child(TreeSelectApp::class) {}
