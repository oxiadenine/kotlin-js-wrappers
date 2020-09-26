package samples.steps

import antd.popover.popover
import antd.steps.step
import antd.steps.steps
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

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
    styledDiv {
        css { +StepsStyles.customizedProgressDot }
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
