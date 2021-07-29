package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinx.css.*
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv
import styled.styledP

fun RBuilder.inner() {
    styledDiv {
        css { +CardStyles.inner }
        card {
            attrs.title = "Card title"
            styledP {
                css {
                    fontSize = 14.px
                    color = rgba(0, 0, 0, 0.85)
                    marginBottom = 16.px
                    fontWeight = FontWeight.w500
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
