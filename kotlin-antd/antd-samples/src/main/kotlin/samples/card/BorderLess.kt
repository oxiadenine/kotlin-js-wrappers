package samples.card

import antd.card.card
import kotlinext.js.js
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.borderLess() {
    styledDiv {
        css { +CardStyles.borderLess }
        div {
            attrs.jsStyle = js {
                background = "#ECECEC"
                padding = "30px"
            }
            card {
                attrs {
                    title = "Card tittle"
                    bordered = false
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
        }
    }
}
