package samples.timeline

import react.*
import react.dom.*
import styled.*

object TimelineStyles : StyleSheet("timeline", isStatic = true) {
    val container by css {}
    val basic by css {}
    val pending by css {}
    val custom by css {}
    val color by css {}
    val alternate by css {}
    val right by css {}
}

class TimelineApp : RComponent<RProps, RState>() {
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
