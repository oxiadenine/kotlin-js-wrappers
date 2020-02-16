package samples.empty

import react.*
import react.dom.*

class EmptyApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Empty" }
        div {
            basic()
            simple()
            customize()
            configProvider()
        }
    }
}

fun RBuilder.emptyApp() = child(EmptyApp::class) {}
