package samples.progress

import antd.progress.progress
import react.*
import react.dom.div
import styled.*

fun RBuilder.format() {
    styledDiv {
        css { +ProgressStyles.format }
        div {
            progress {
                attrs {
                    type = "circle"
                    percent = 70
                    format = { percent, _ -> "$percent Days" }
                }
            }
            progress {
                attrs {
                    type = "circle"
                    percent = 100
                    format = { _, _ -> "Done" }
                }
            }
        }
    }
}
