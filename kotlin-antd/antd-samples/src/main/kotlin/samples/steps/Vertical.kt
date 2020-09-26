package samples.steps

import antd.steps.*
import react.*
import styled.*

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
