package samples.skeleton

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

object SkeletonStyles : StyleSheet("skeleton", isStatic = true) {
    val container by css {}
    val basic by css {}
    val complex by css {}
    val active by css {}
    val children by css {
        descendants("article") {
            descendants("h4") {
                marginBottom = 16.px
            }
        }
        descendants(".article") {
            descendants("button") {
                marginTop = 16.px
            }
        }
    }
    val list by css {
        descendants(".skeleton-demo") {
            border(1.px, BorderStyle.solid, Color("#f4f4f4"))
        }
    }
}

class SkeletonApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Skeleton" }
        styledDiv {
            css { +SkeletonStyles.container }
            basic()
            complex()
            active()
            child()
            list()
        }
    }
}

fun RBuilder.skeletonApp() = child(SkeletonApp::class) {}
