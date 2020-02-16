package samples.tag

import react.*
import react.dom.*

class TagApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Tag" }
        div {
            basic()
            control()
            hotTags()
            colorful()
            checkable()
            controlled()
        }
    }
}

fun RBuilder.tagApp() = child(TagApp::class) {}
