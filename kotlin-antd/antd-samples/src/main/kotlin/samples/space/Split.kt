package samples.space

import antd.divider.divider
import antd.space.space
import antd.typography.typographyLink
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

private fun RBuilder.spaceSplit() {
    space {
        attrs {
            split = buildElement {
                divider {
                    attrs.type = "vertical"
                }
            }
        }
        typographyLink { +"Link" }
        typographyLink { +"Link" }
        typographyLink { +"Link" }
    }
}

fun RBuilder.split() {
    styledDiv {
        css { +SpaceStyles.split }
        spaceSplit()
    }
}
