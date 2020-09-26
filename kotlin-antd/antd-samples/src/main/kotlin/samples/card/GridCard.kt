package samples.card

import antd.card.card
import antd.card.cardGrid
import kotlinext.js.js
import react.RBuilder
import styled.css
import styled.styledDiv

private val gridStyle = js {
    eidth = "25%"
    textAlign = "center"
}

fun RBuilder.gridCard() {
    styledDiv {
        css { +CardStyles.gridCard }
        card {
            attrs.title = "Card Title"
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
            cardGrid {
                attrs.style = gridStyle
                +"Content"
            }
        }
    }
}
