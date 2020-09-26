package samples.progress

import antd.progress.progress
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.linecap() {
    styledDiv {
        css { +ProgressStyles.linecap }
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
