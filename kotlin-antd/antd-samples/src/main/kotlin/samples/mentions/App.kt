package samples.mentions

import react.*
import react.dom.*

class MentionsApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Mentions" }
        div {
            basic()
            readonly()
            async()
            prefix()
            placement()
        }
    }
}

fun RBuilder.mentionsApp() = child(MentionsApp::class) {}
