package samples.alert

import antd.alert.alert
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.banner() {
    styledDiv {
        css { +AlertStyles.banner }
        div {
            alert {
                attrs {
                    message = "Warning text"
                    banner = true
                }
            }
            br {}
            alert {
                attrs {
                    message = "Very long warning text warning text text text text text text text"
                    banner = true
                    closable = true
                }
            }
            br {}
            alert {
                attrs {
                    showIcon = false
                    message = "Warning text without icon"
                    banner = true
                }
            }
            br {}
            alert {
                attrs {
                    type = "error"
                    message = "Error text"
                    banner = true
                }
            }
        }
    }
}
