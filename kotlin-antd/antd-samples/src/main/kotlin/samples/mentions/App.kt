package samples.mentions

import react.*
import react.dom.*
import styled.*

object MentionsStyles : StyleSheet("mentions", isStatic = true) {
    val container by css {}
    val basic by css {}
    val readonly by css {}
    val async by css {}
    val prefix by css {}
    val placement by css {}
}

class MentionsApp : RComponent<RProps, RState>() {
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
