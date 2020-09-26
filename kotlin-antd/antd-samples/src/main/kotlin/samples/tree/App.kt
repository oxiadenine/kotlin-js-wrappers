package samples.tree

import react.*
import react.dom.*
import styled.*

object TreeStyles : StyleSheet("tree", isStatic = true) {
    val container by css {}
    val basic by css {}
    val customizedIcon by css {}
    val basicControlled by css {}
    val dynamic by css {}
    val line by css {}
    val directory by css {}
}

class TreeApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Tree" }
        styledDiv {
            css { +TreeStyles.container }
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
