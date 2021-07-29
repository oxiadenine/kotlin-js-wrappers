package samples.card

import antd.card.card
import kotlinext.js.js
import kotlinx.css.background
import kotlinx.css.padding
import react.RBuilder
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.borderLess() {
    styledDiv {
        css { +CardStyles.borderLess }
        styledDiv {
            css {
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
