package samples.rate

import antd.rate.rate
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.disabled() {
    div("rate-container") {
        attrs.id = "rate-disabled"
        rate {
            attrs {
                disabled = true
                defaultValue = 2
            }
        }
    }
}
