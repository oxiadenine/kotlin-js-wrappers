package samples.timeline

import antd.timeline.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +TimelineStyles.basic }
        timeline {
            timelineItem { +"Create a services site 2015-09-01" }
            timelineItem { +"Solve initial network problems 2015-09-01" }
            timelineItem { +"Technical testing 2015-09-01" }
            timelineItem { +"Network problems being solved 2015-09-01" }
        }
    }
}
