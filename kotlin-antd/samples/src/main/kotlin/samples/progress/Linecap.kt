package samples.progress

import antd.progress.progress
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.linecap() {
    div("progress-container") {
        attrs.id = "progress-linecap"
        div {
            progress {
                attrs {
                    strokeLinecap = "square"
                    percent = 75
                }
            }
            progress {
                attrs {
                    strokeLinecap = "square"
                    type = "circle"
                    percent = 70
                }
            }
            progress {
                attrs {
                    strokeLinecap = "square"
                    type = "dashboard"
                    percent = 75
                }
            }
        }
    }
}
