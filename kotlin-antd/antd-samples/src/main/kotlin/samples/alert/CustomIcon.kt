package samples.alert

import antd.alert.alert
import antd.icon.icon
import react.RBuilder
import react.buildElement
import react.dom.div
import styled.css
import styled.styledDiv

private val smileIcon = buildElement {
    icon {
        attrs.type = "smile"
    }
}

fun RBuilder.customIcon() {
    styledDiv {
        css { +AlertStyles.customIcon }
        div {
            alert {
                attrs {
                    icon = smileIcon
                    message = "showIcon = false"
                    type = "success"
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Success Tips"
                    type = "success"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Informational Notes"
                    type = "info"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Warning"
                    type = "warning"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Error"
                    type = "error"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Success Tips"
                    description = "Detailed description and advice about successful copywriting."
                    type = "success"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Informational Notes"
                    description = "Additional description and information about copywriting."
                    type = "info"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Warning"
                    description = "This is a warning notice about copywriting."
                    type = "warning"
                    showIcon = true
                }
            }
            alert {
                attrs {
                    icon = smileIcon
                    message = "Error"
                    description = "This is an error message about copywriting."
                    type = "error"
                    showIcon = true
                }
            }
        }
    }
}
