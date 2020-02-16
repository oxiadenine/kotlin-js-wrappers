package samples.steps

import antd.steps.step
import antd.steps.steps
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.smallSize() {
    div("steps-container") {
        attrs.id = "steps-small-size"
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
