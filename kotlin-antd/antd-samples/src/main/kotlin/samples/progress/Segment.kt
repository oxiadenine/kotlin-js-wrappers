package samples.progress

import antd.progress.progress
import antd.tooltip.tooltip
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.segment() {
    div("progress-container") {
        attrs.id = "progress-segment"
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
