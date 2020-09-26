package samples.progress

import antd.progress.progress
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.dashboard() {
    styledDiv {
        css { +ProgressStyles.dashboard }
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
