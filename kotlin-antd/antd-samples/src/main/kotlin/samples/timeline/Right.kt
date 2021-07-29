package samples.timeline

import antd.icon.clockCircleOutlined
import antd.timeline.timeline
import antd.timeline.timelineItem
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

fun RBuilder.right() {
    styledDiv {
        css { +TimelineStyles.right }
        timeline {
            attrs.mode = "right"
            timelineItem { +"Create a services site 2015-09-01" }
            timelineItem { +"Solve initial network problems 2015-09-01" }
            timelineItem {
                attrs {
                    dot = buildElement {
                        clockCircleOutlined {
                            attrs {
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
