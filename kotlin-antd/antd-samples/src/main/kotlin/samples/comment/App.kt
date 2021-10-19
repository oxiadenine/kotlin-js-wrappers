package samples.comment

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object CommentStyles : StyleSheet("comment", isStatic = true) {
    val container by css {}
    val basic by css {}
    val list by css {}
    val nested by css {}
    val editor by css {}
}

class CommentApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Comment" }
        styledDiv {
            css { +CommentStyles.container }
            basic()
            list()
            nested()
            editor()
        }
    }
}

fun RBuilder.commentApp() = child(CommentApp::class) {}
