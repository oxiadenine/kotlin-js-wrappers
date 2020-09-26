package samples.mention

import react.*
import react.dom.*
import styled.*

object MentionStyles : StyleSheet("mention", isStatic = true) {
    val container by css {}
    val basic by css {}
    val async by css {}
    val avatar by css {}
    val controlled by css {}
    val popupContainer by css {}
    val multipleTrigger by css {}
    val placement by css {}
    val customTag by css {}
    val controlledSimple by css {}
    val multilines by css {}
    val readonly by css {}
}

class MentionApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Mention (Deprecated)" }
        styledDiv {
            css { +MentionStyles.container }
            basic()
            async()
            avatar()
            controlled()
            popupContainer()
            multipleTrigger()
            placemenet()
            customTag()
            controlledSimple()
            multilines()
            readonly()
        }
    }
}

fun RBuilder.mentionApp() = child(MentionApp::class) {}
