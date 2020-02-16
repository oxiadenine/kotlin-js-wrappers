package samples.progress

import antd.progress.progress
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.line() {
    div("progress-container") {
        attrs.id = "progress-line"
        div {
            progress {
                attrs.percent = 30
            }
            progress {
                attrs {
                    percent = 50
                    status = "active"
                }
            }
            progress {
                attrs {
                    percent = 70
                    status = "exception"
                }
            }
            progress {
                attrs.percent = 100
            }
            progress {
                attrs {
                    percent = 50
                    showInfo = false
                }
            }
        }
    }
}
