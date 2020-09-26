package samples.card

import antd.card.*
import kotlinext.js.*
import react.*
import styled.*

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
