package samples.alert

import antd.alert.alert
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.closeText() {
    div("alert-container") {
        attrs.id = "alert-close-text"
        alert {
            attrs {
                message = "Info Text"
                type = "info"
                closeText = "Close Now"
            }
        }
    }
}
