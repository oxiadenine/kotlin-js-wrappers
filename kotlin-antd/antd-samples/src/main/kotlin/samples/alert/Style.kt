package samples.alert

import antd.alert.alert
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.style() {
    div("alert-container") {
        attrs.id = "alert-style"
        div {
            alert {
                attrs {
                    message = "Success Text"
                    type = "success"
                }
            }
            alert {
                attrs {
                    message = "Info Text"
                    type = "info"
                }
            }
            alert {
                attrs {
                    message = "Warning Text"
                    type = "warning"
                }
            }
            alert {
                attrs {
                    message = "Error Text"
                    type = "error"
                }
            }
        }
    }
}
