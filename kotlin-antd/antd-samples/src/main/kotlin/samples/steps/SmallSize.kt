package samples.steps

import antd.steps.*
import react.*
import styled.*

fun RBuilder.smallSize() {
    styledDiv {
        css { +StepsStyles.smallSize }
        steps {
            attrs {
                size = "small"
                current = 1
            }
            step {
                attrs.title = "Finished"
            }
            step {
                attrs.title = "In Progress"
            }
            step {
                attrs.title = "Waiting"
            }
        }
    }
}
