package samples.steps

import antd.icon.loadingOutlined
import antd.icon.smileOutlined
import antd.icon.solutionOutlined
import antd.icon.userOutlined
import antd.steps.step
import antd.steps.steps
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

fun RBuilder.icon() {
    styledDiv {
        css { +StepsStyles.icon }
        steps {
            step {
                attrs {
                    status = "finish"
                    title = "Login"
                    icon = buildElement {
                        userOutlined {}
                    }
                }
            }
            step {
                attrs {
                    status = "finish"
                    title = "Verification"
                    icon = buildElement {
                        solutionOutlined {}
                    }
                }
            }
            step {
                attrs {
                    status = "process"
                    title = "Pay"
                    icon = buildElement {
                        loadingOutlined {}
                    }
                }
            }
            step {
                attrs {
                    status = "wait"
                    title = "Done"
                    icon = buildElement {
                        smileOutlined {}
                    }
                }
            }
        }
    }
}
