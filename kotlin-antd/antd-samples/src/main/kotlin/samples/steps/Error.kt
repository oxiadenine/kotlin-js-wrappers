package samples.steps

import antd.steps.step
import antd.steps.steps
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.error() {
    div("steps-container") {
        attrs.id = "steps-error"
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
