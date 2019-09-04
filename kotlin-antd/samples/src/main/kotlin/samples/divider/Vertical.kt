package samples.divider

import antd.divider.divider
import kotlinx.html.id
import react.RBuilder
import react.dom.a
import react.dom.div

fun RBuilder.vertical() {
    div("divider-container") {
        attrs.id = "divider-vertical"
        div {
            +"Text"
            divider {
                attrs.type = "vertical"
            }
            a {
                attrs.href = "#"
                +"Link"
            }
            divider {
                attrs.type = "vertical"
            }
            a {
                attrs.href = "#"
                +"Link"
            }
        }
    }
}
