package samples.steps

import antd.steps.step
import antd.steps.steps
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.vertical() {
    div("steps-container") {
        attrs.id = "steps-vertical"
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
