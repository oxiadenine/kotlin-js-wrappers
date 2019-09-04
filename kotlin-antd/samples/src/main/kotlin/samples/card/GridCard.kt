package samples.card

import antd.card.card
import antd.card.cardGrid
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val gridStyle = js {
    eidth = "25%"
    textAlign = "center"
}

fun RBuilder.gridCard() {
    div("card-container") {
        attrs.id = "card-grid-card"
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
