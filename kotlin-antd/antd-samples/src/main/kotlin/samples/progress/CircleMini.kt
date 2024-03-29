package samples.progress

import antd.progress.progress
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.circleMini() {
    styledDiv {
        css { +ProgressStyles.circleMini }
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
