package samples.steps

import antd.steps.step
import antd.steps.steps
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.verticalSmall() {
    styledDiv {
        css { +StepsStyles.verticalSmall }
        steps {
            attrs {
                direction = "vertical"
                size = "small"
                current = 1
            }
            step {
                attrs {
                    title = "Finished"
                    description = "This is a description"
                }
            }
            step {
                attrs {
                    title = "In Progress"
                    description = "This is a description"
                }
            }
            step {
                attrs {
                    title = "Waiting"
                    description = "This is a description"
                }
            }
        }
    }
}
