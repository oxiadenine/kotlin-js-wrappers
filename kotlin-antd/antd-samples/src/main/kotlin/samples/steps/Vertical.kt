package samples.steps

import antd.steps.step
import antd.steps.steps
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.vertical() {
    styledDiv {
        css { +StepsStyles.vertical }
        steps {
            attrs {
                direction = "vertical"
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
