package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div
import react.dom.p

fun RBuilder.basic() {
    div("card-container") {
        attrs.id = "card-basic"
        div {
            card {
                attrs {
                    title = "Default size card"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
            card {
                attrs {
                    size = "small"
                    title = "Small size card"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
        }
    }
}
