package samples.tree

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TreeStyles : StyleSheet("tree", isStatic = true) {
    val container by css {}
    val basic by css {}
    val customizedIcon by css {}
    val basicControlled by css {}
    val dynamic by css {}
    val line by css {}
    val directory by css {}
}

class TreeApp : RComponent<RProps, State>() {
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
