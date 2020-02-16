package samples.alert

import antd.alert.alert
import kotlinx.html.id
import react.RBuilder
import react.dom.br
import react.dom.div

fun RBuilder.banner() {
    div("alert-container") {
        attrs.id = "alert-banner"
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
