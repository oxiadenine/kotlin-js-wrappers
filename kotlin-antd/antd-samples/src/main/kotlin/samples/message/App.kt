package samples.message

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object MessageStyles : StyleSheet("message", isStatic = true) {
    val container by css {}
    val info by css {}
    val duration by css {}
    val thenable by css {}
    val other by css {}
    val loading by css {}
    val hooks by css {}
}

class MessageApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Message" }
        styledDiv {
            css { +MessageStyles.container }
            info()
            duration()
            thenable()
            other()
            loading()
            hooks()
        }
    }
}

fun RBuilder.messageApp() = child(MessageApp::class) {}
