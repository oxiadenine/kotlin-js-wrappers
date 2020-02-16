package samples.timeline

import antd.timeline.timeline
import antd.timeline.timelineItem
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.basic() {
    div("timeline-container") {
        attrs.id = "timeline-basic"
        timeline {
            timelineItem { +"Create a services site 2015-09-01" }
            timelineItem { +"Solve initial network problems 2015-09-01" }
            timelineItem { +"Technical testing 2015-09-01" }
            timelineItem { +"Network problems being solved 2015-09-01" }
        }
    }
}
