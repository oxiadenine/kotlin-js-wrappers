package samples.mentions

import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object MentionsStyles : StyleSheet("mentions", isStatic = true) {
    val container by css {}
    val basic by css {}
    val readonly by css {}
    val async by css {}
    val prefix by css {}
    val placement by css {}
}

class MentionsApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Mentions" }
        styledDiv {
            css { MentionsStyles.container }
            basic()
            readonly()
            async()
            prefix()
            placement()
        }
    }
}

fun RBuilder.mentionsApp() = child(MentionsApp::class) {}
