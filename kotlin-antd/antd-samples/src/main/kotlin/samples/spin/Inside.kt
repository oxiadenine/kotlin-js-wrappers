package samples.spin

import antd.spin.spin
import kotlinx.html.classes
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.inside() {
    div("spin-container") {
        attrs.id = "spin-inside"
        div {
            attrs.classes = setOf("example")
            spin {}
        }
    }
}
