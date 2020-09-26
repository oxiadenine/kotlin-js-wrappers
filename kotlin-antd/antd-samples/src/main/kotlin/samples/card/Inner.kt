package samples.card

import antd.card.card
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.jsStyle
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.inner() {
    styledDiv {
        css { +CardStyles.inner }
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
