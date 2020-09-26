package samples.empty

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object EmptyStyles : StyleSheet("empty", isStatic = true) {
    val container by css {}
    val basic by css {}
    val simple by css {}
    val customize by css {}
    val configProvider by css {
        descendants(".config-provider") {
            descendants("h3") {
                margin(16.px, 0.px, 8.px, 0.px)
                fontSize = LinearDimension.inherit
            }
        }
    }
}

class EmptyApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Empty" }
        styledDiv {
            css { +EmptyStyles.container }
            basic()
            simple()
            customize()
            configProvider()
        }
    }
}

fun RBuilder.emptyApp() = child(EmptyApp::class) {}
