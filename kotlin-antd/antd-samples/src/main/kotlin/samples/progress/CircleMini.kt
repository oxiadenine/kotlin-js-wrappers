package samples.progress

import antd.progress.progress
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.circleMini() {
    div("progress-container") {
        attrs.id = "progress-circle-mini"
        div {
            progress {
                attrs {
                    type = "circle"
                    percent = 30
                    width = 50
                }
            }
            progress {
                attrs {
                    type = "circle"
                    percent = 70
                    width = 80
                    status = "exception"
                }
            }
            progress {
                attrs {
                    type = "circle"
                    percent = 100
                    width = 80
                }
            }
        }
    }
}
