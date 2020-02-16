package samples.message

import react.*
import react.dom.*

class MessageApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Message" }
        div {
            info()
            duration()
            thenable()
            other()
            loading()
        }
    }
}

fun RBuilder.messageApp() = child(MessageApp::class) {}
