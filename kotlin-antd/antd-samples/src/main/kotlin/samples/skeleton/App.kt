package samples.skeleton

import react.*
import react.dom.*

class SkeletonApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Skeleton" }
        div {
            basic()
            complex()
            active()
            child()
            list()
        }
    }
}

fun RBuilder.skeletonApp() = child(SkeletonApp::class) {}
