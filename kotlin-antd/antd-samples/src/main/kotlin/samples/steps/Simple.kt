package samples.steps

import antd.steps.step
import antd.steps.steps
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.simple() {
    styledDiv {
        css { +StepsStyles.simple }
        steps {
            attrs.current = 1
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
