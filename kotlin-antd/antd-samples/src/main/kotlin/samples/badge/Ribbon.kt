package samples.badge

import antd.badge.badgeRibbon
import antd.card.card
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.ribbon() {
    styledDiv {
        css { +BadgeStyles.ribbon }
        badgeRibbon {
            attrs.text = "Pushes open the window"
            card { +"And raises the spyglass." }
        }
    }
}
