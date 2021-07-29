package samples.space

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

object SpaceStyles : StyleSheet("space", isStatic = true) {
    val container by css {}
    val align by css {
        descendants(".space-align-container") {
            display = Display.flex
            alignItems = Align.flexStart
            flexWrap = FlexWrap.wrap
        }
        descendants(".space-align-block") {
            margin(8.px, 4.px)
            border(1.px, BorderStyle.solid, Color("#40a9ff"))
            padding(all = 4.px)
            flex(0.0, 0.0, FlexBasis.zero)
            descendants(".mock-block") {
                display = Display.inlineBlock
                padding(32.px, 8.px ,16.px)
                background = rgba(150, 150, 150, 0.2).toString()
            }
        }
    }
    val base by css {}
    val customize by css {}
    val size by css {}
    val split by css {}
    val vertical by css {}
}

class SpaceApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Space" }
        styledDiv {
            css { +SpaceStyles.container }
            align()
            base()
            customize()
            size()
            split()
            vertical()
        }
    }
}

fun RBuilder.spaceApp() = child(SpaceApp::class) {}
