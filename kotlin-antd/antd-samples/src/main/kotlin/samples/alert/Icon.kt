package samples.alert

import antd.alert.alert
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.icon() {
    styledDiv {
        css { +AlertStyles.icon }
        div {
            alert {
                attrs {
                    message = "Success Tips"
                    type = "success"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Informational Notes"
                    type = "info"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Warning"
                    type = "warning"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Error"
                    type = "error"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Success Tips"
                    description = "Detailed description and advice about successful copywriting."
                    type = "success"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Informational Notes"
                    description = "Additional description and information about copywriting."
                    type = "info"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Warning"
                    description = "This is a warning notice about copywriting."
                    type = "warning"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    message = "Error"
                    description = "This is an error message about copywriting."
                    type = "error"
                    showIcon = true
                }
            }
        }
    }
}
