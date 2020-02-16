package samples.mention

import react.*
import react.dom.*

class MentionApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Mention (Deprecated)" }
        div {
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
