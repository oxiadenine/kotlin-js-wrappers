package samples.timeline

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TimelineStyles : StyleSheet("timeline", isStatic = true) {
    val container by css {}
    val basic by css {}
    val pending by css {}
    val custom by css {}
    val color by css {}
    val alternate by css {}
    val right by css {}
}

class TimelineApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Timeline" }
        styledDiv {
            css { +TimelineStyles.container }
            basic()
            pending()
            custom()
            color()
            alternate()
            right()
        }
    }
}

fun RBuilder.timelineApp() = child(TimelineApp::class) {}
