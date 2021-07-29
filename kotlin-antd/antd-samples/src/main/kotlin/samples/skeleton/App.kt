package samples.skeleton

import kotlinx.css.*
import kotlinx.css.properties.border
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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
    val element by css {}
}

class SkeletonApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Skeleton" }
        styledDiv {
            css { +SkeletonStyles.container }
            basic()
            complex()
            active()
            child()
            list()
            element()
        }
    }
}

fun RBuilder.skeletonApp() = child(SkeletonApp::class) {}
