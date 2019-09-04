package samples.progress

import antd.progress.progress
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.format() {
    div("progress-container") {
        attrs.id = "progress-format"
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
