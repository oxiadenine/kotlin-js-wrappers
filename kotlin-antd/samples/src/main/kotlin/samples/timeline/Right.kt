package samples.timeline

import antd.icon.icon
import antd.timeline.timeline
import antd.timeline.timelineItem
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div

fun RBuilder.right() {
    div("timeline-container") {
        attrs.id = "timeline-right"
        timeline {
            attrs.mode = "right"
            timelineItem { +"Create a services site 2015-09-01" }
            timelineItem { +"Solve initial network problems 2015-09-01" }
            timelineItem {
                attrs {
                    dot = buildElement {
                        icon {
                            attrs {
                                type = "clock-circle-o"
                                style = js { fontSize = "16px" }
                                color = "red"
                            }
                        }
                    }
                }
                +"Technical testing 2015-09-01"
            }
            timelineItem { +"Network problems being solved 2015-09-01" }
        }
    }
}
