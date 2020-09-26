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
                        icon {
                            attrs.type = "user"
                        }
                    }
                }
            }
            step {
                attrs {
                    status = "finish"
                    title = "Verification"
                    icon = buildElement {
                        icon {
                            attrs.type = "solution"
                        }
                    }
                }
            }
            step {
                attrs {
                    status = "process"
                    title = "Pay"
                    icon = buildElement {
                        icon {
                            attrs.type = "loading"
                        }
                    }
                }
            }
            step {
                attrs {
                    status = "wait"
                    title = "Done"
                    icon = buildElement {
                        icon {
                            attrs.type = "smile-o"
                        }
                    }
                }
            }
        }
    }
}
