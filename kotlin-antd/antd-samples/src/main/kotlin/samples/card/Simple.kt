package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.p

fun RBuilder.simple() {
    div("card-container") {
        attrs.id = "card-simple"
        card {
            attrs.style = js { width = 300 }
            p { +"Card content" }
            p { +"Card content" }
            p { +"Card content" }
        }
    }
}
