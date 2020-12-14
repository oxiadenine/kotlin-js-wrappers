package samples.timeline

import antd.icon.*
import antd.timeline.*
import kotlinext.js.*
import react.*
import styled.*

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
