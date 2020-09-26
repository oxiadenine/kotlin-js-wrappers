package samples.progress

import antd.progress.progress
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.circle() {
    styledDiv {
        css { +ProgressStyles.circle }
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
