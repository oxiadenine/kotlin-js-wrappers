package samples.progress

import antd.progress.progress
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.dashboard() {
    div("progress-container") {
        attrs.id = "progress-dashboard"
        div {
            progress {
                attrs {
                    type = "dashboard"
                    percent = 75
                }
            }
        }
    }
}
