package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div
import react.dom.jsStyle
import react.dom.p

fun RBuilder.inner() {
    div("card-container") {
        attrs.id = "card-inner"
        card {
            attrs.title = "Card title"
            p {
                attrs.jsStyle = js {
                    fontSize = 14
                    color = "rgba(0, 0, 0, 0.85)"
                    marginButton = 16
                    fontWeight = 500
                }
                +"Group title"
            }
            card {
                attrs {
                    type = "inner"
                    title = "Inner Card title"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                }
                +"Inner Card content"
            }
            card {
                attrs {
                    style = js { marginTop = 16 }
                    type = "inner"
                    title = "Inner Card title"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                }
                +"Inner Card content"
            }
        }
    }
}
