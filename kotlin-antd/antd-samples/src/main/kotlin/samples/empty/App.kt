package samples.empty

import kotlinx.css.LinearDimension
import kotlinx.css.fontSize
import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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

class EmptyApp : RComponent<Props, State>() {
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
