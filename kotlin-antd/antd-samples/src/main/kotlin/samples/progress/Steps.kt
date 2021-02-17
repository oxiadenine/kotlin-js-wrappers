package samples.progress

import antd.progress.progress
import react.RBuilder
import react.dom.br
import styled.css
import styled.styledDiv

fun RBuilder.steps() {
    styledDiv {
        css { ProgressStyles.steps }
        progress {
            attrs {
                percent = 50
                steps = 3
            }
        }
        br {}
        progress {
            attrs {
                percent = 30
                steps = 5
            }
        }
        br {}
        progress {
            attrs {
                percent = 100
                steps = 5
                size = "small"
                strokeColor = "#52c41a"
            }
        }
    }
}
