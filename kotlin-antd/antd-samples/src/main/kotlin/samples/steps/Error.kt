package samples.steps

import antd.steps.*
import react.*
import styled.*

fun RBuilder.error() {
    styledDiv {
        css { +StepsStyles.error }
        steps {
            attrs {
                current = 1
                status = "error"
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
