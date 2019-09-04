package samples.rate

import antd.rate.rate
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.half() {
    div("rate-container") {
        attrs.id = "rate-half"
        rate {
            attrs {
                allowHalf = true
                defaultValue = 2.5
            }
        }
    }
}
