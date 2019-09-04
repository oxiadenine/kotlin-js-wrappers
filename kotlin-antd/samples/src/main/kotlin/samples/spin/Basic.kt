package samples.spin

import antd.spin.spin
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.basic() {
    div("spin-container") {
        attrs.id = "spin-basic"
        spin {}
    }
}
