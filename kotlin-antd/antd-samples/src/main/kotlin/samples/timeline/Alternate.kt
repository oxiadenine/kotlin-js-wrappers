package samples.timeline

import antd.icon.*
import antd.timeline.*
import kotlinext.js.*
import react.*
import styled.*

fun RBuilder.alternate() {
    styledDiv {
        css { +TimelineStyles.alternate }
        timeline {
            attrs.mode = "alternate"
            timelineItem { +"Create a services site 2015-09-01" }
            timelineItem {
                attrs.color = "green"
                +"Solve initial network problems 2015-09-01"
            }
            timelineItem {
                attrs {
                    dot = buildElement {
                        clockCircleOutlined {
                            attrs{
                                style = js { fontSize = "16px" }
                                color = "red"
                            }
                        }
                    }
                }
                +"""
                    Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
                    laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto
                    beatae vitae dicta sunt explicabo.
                """.trimIndent()
            }
            timelineItem {
                attrs.color = "red"
                +"Network problems being solved 2015-09-01"
            }
            timelineItem { +"Create a services site 2015-09-01" }
            timelineItem {
                attrs {
                    dot = buildElement {
                        clockCircleOutlined {
                            attrs{
                                style = js { fontSize = "16px" }
                                color = "red"
                            }
                        }
                    }
                }
                +"Technical testing 2015-09-01"
            }
        }
    }
}
