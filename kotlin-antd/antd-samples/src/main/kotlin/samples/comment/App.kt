package samples.comment

import react.*
import react.dom.*

class CommentApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Comment" }
        div {
            basic()
            list()
            nested()
            editor()
        }
    }
}

fun RBuilder.commentApp() = child(CommentApp::class) {}
