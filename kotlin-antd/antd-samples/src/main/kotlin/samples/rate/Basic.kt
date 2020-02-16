package samples.rate

import antd.rate.rate
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("rate-container") {
        attrs.id = "rate-basic"
        rate {}
    }
}
