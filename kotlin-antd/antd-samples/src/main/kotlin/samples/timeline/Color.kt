package samples.timeline

import antd.timeline.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.color() {
    styledDiv {
        css { +TimelineStyles.color }
        timeline {
            timelineItem {
                attrs.color = "green"
                +"Create a services site 2015-09-01"
            }
            timelineItem {
                attrs.color = "green"
                +"Create a services site 2015-09-01"
            }
            timelineItem {
                attrs.color = "red"
                p { +"Solve initial network problems 1" }
                p { +"Solve initial network problems 2" }
                p { +"Solve initial network problems 3 2015-09-01" }
            }
            timelineItem {
                p { +"Technical testing 1" }
                p { +"Technical testing 2" }
                p { +"STechnical testing 3 2015-09-01" }
            }
        }
    }
}
