package samples.space

import antd.card.card
import antd.space.space
import kotlinext.js.js
import react.RBuilder
import react.dom.p
import styled.css
import styled.styledDiv

private fun RBuilder.spaceVertical() {
    space {
        attrs.direction = "vertical"
        card {
            attrs {
                title = "Card"
                style = js { width = 300 }
            }
            p { +"Card content" }
            p { +"Card content" }
        }
        card {
            attrs {
                title = "Card"
                style = js { width = 300 }
            }
            p { +"Card content" }
            p { +"Card content" }
        }
    }
}

fun RBuilder.vertical() {
    styledDiv {
        css { +SpaceStyles.vertical }
        spaceVertical()
    }
}
