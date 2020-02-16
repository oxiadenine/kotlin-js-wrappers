package samples.badge

import react.*
import react.dom.*

class BadgeApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Badge" }
        div {
            basic()
            overflow()
            link()
            status()
            noWrapper()
            dot()
            change()
            title()
            colorful()
        }
    }
}

fun RBuilder.badgeApp() = child(BadgeApp::class) {}
