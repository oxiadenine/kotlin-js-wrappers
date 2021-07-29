package samples.treeselect

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TreeSelectStyles : StyleSheet("tree-select", isStatic = true) {
    val container by css {}
    val basic by css {}
    val treeData by css {}
    val multiple by css {}
    val checkable by css {}
    val suffix by css {}
}

class TreeSelectApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"TreeSelect" }
        styledDiv {
            css { +TreeSelectStyles.container }
            basic()
            treeData()
            multiple()
            checkable()
            suffix()
        }
    }
}

fun RBuilder.treeSelectApp() = child(TreeSelectApp::class) {}
