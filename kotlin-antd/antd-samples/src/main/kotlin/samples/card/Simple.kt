package samples.card

import antd.card.card
import kotlinext.js.js
import react.RBuilder
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.simple() {
    styledDiv {
        css { +CardStyles.simple }
        card {
            attrs.style = js { width = 300 }
            p { +"Card content" }
            p { +"Card content" }
            p { +"Card content" }
        }
    }
}
