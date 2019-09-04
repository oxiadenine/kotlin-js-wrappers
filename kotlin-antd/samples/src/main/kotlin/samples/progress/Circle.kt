package samples.progress

import antd.progress.progress
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.circle() {
    div("progress-container") {
        attrs.id = "progress-circle"
        div {
            progress {
                attrs {
                    type = "circle"
                    percent = 75
                }
            }
            progress {
                attrs {
                    type = "circle"
                    percent = 70
                    status = "exception"
                }
            }
            progress {
                attrs {
                    type = "circle"
                    percent = 100
                }
            }
        }
    }
}
