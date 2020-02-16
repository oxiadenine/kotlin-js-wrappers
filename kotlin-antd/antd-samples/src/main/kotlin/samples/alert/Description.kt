package samples.alert

import antd.alert.alert
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.description() {
    div("alert-container") {
        attrs.id = "alert-description"
        div {
            alert {
                attrs {
                    message = "Success Text"
                    description = "Success Description Success Description Success Description"
                    type = "success"
                }
            }
            alert {
                attrs {
                    message = "Info Text"
                    description = "Info Description Info Description Info Description Info Description"
                    type = "info"
                }
            }
            alert {
                attrs {
                    message = "Warning Text"
                    description = "Warning Description Warning Description Warning Description Warning Description"
                    type = "warning"
                }
            }
            alert {
                attrs {
                    message = "Error Text"
                    description = "Error Description Error Description Error Description Error Description"
                    type = "error"
                }
            }
        }
    }
}
