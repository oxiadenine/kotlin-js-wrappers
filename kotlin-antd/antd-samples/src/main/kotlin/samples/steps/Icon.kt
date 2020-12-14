package samples.steps

import antd.icon.*
import antd.steps.*
import react.*
import styled.*

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
