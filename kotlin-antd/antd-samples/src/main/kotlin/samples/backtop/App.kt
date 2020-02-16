package samples.backtop

import react.*
import react.dom.*

class BackTopApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"BackTop" }
        div {
            basic()
            custom()
        }
    }
}

fun RBuilder.backTopApp() = child(BackTopApp::class) {}
