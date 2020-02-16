package samples.timeline

import react.*
import react.dom.*

class TimelineApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Timeline" }
        div {
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
