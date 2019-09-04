package samples.progress

import antd.progress.progress
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.jsStyle

fun RBuilder.lineMini() {
    div("progress-container") {
        attrs.id = "progress-line-mini"
        div {
            attrs.jsStyle = js { width = 170 }
            progress {
                attrs {
                    percent = 30
                    size = "small"
                }
            }
            progress {
                attrs {
                    percent = 50
                    size = "small"
                    status = "active"
                }
            }
            progress {
                attrs {
                    percent = 70
                    size = "small"
                    status = "exception"
                }
            }
            progress {
                attrs {
                    percent = 100
                    size = "small"
                }
            }
        }
    }
}
