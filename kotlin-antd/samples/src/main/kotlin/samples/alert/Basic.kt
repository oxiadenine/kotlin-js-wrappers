package samples.alert

import antd.alert.alert
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.basic() {
    div("alert-container") {
        attrs.id = "alert-basic"
        alert {
            attrs {
                message = "Success Text"
                type = "success"
            }
        }
    }
}
