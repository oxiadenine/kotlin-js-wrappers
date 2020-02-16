package samples.timeline

import antd.MouseEventHandler
import antd.button.button
import antd.timeline.timeline
import antd.timeline.timelineItem
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.div

interface PendingTimeLineState : RState {
    var reverse: Boolean
}

class PendingTimeLine : RComponent<RProps, PendingTimeLineState>() {
    private val handleClick: MouseEventHandler<Any> = {
        setState {
            reverse = !state.reverse
        }
    }

    override fun PendingTimeLineState.init() {
        reverse = false
    }

    override fun RBuilder.render() {
        div {
            timeline {
                attrs {
                    pending = "Recording..."
                    reverse = state.reverse
                }
                timelineItem { +"Create a services site 2015-09-01" }
                timelineItem { +"Solve initial network problems 2015-09-01" }
                timelineItem { +"Technical testing 2015-09-01" }
            }
            button {
                attrs {
                    type = "primary"
                    style = js { marginTop = 16 }
                    onClick = handleClick
                }
                +"Toggle Reverse"
            }
        }
    }
}

fun RBuilder.pendingTimeLine() = child(PendingTimeLine::class) {}

fun RBuilder.pending() {
    div("timeline-container") {
        attrs.id = "timeline-pending"
        pendingTimeLine()
    }
}
