package samples.card

import antd.card.card
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +CardStyles.basic }
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
