package samples.spin

import antd.spin.spin
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.size() {
    div("spin-container") {
        attrs.id = "spin-size"
        spin {
            attrs.size = "small"
        }
        spin {}
        spin {
            attrs.size = "large"
        }
    }
}
