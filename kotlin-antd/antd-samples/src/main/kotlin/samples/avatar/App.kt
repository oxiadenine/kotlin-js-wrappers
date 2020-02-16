package samples.avatar

import react.*
import react.dom.*

class AvatarApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Avatar" }
        div {
            basic()
            dynamic()
            type()
            badge()
            toggleDebug()
        }
    }
}

fun RBuilder.avatarApp() = child(AvatarApp::class) {}
