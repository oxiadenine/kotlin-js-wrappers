package samples.steps

import antd.steps.*
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.verticalSmall() {
    div("steps-container") {
        attrs.id = "steps-vertical-small"
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
