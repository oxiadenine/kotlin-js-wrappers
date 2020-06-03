package samples.steps

import antd.popover.popover
import antd.steps.step
import antd.steps.steps
import kotlinx.html.id
import react.*
import react.dom.*

interface CustomDotStep {
    var index: String
    var status: String
}

private val customDot = fun (dot: ReactElement, step: CustomDotStep): ReactElement {
    return buildElement {
        popover {
            attrs {
                content = buildElement {
                    span {
                        +"step ${step.index} status: ${step.status}"
                    }
                }
            }
            childList.add(dot)
        }
    }
}

fun RBuilder.customizedProgressDot() {
    div("steps-container") {
        attrs.id = "steps-customized-progress-dot"
        steps {
            attrs {
                current = 1
                progressDot = customDot
            }
            step {
                attrs {
                    title = "Finished"
                    description = "You can hover on the dot"
                }
            }
            step {
                attrs {
                    title = "In Progress"
                    description = "You can hover on the dot"
                }
            }
            step {
                attrs {
                    title = "Waiting"
                    description = "You can hover on the dot"
                }
            }
            step {
                attrs {
                    title = "Waiting"
                    description = "You can hover on the dot"
                }
            }
        }
    }
}
