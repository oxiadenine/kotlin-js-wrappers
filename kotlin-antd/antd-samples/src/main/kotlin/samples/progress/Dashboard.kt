package samples.progress

import antd.progress.progress
import react.*
import react.dom.div
import styled.*

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
