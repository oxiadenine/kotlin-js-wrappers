package samples.progress

import antd.progress.progress
import antd.tooltip.tooltip
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.segment() {
    styledDiv {
        css { +ProgressStyles.segment }
        div {
            tooltip {
                attrs.title = "3 done / 3 in progress / 4 to do"
                progress {
                    attrs {
                        percent = 60
                        successPercent = 30
                    }
                }
            }
            tooltip {
                attrs.title = "3 done / 3 in progress / 4 to do"
                progress {
                    attrs {
                        percent = 60
                        successPercent = 30
                        type = "circle"
                    }
                }
            }
            tooltip {
                attrs.title = "3 done / 3 in progress / 4 to do"
                progress {
                    attrs {
                        percent = 60
                        successPercent = 30
                        type = "dashboard"
                    }
                }
            }
        }
    }
}
