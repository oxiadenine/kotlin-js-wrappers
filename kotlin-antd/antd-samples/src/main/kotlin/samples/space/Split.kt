package samples.space

import antd.divider.divider
import antd.space.space
import antd.typography.link
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
        link { +"Link" }
        link { +"Link" }
        link { +"Link" }
    }
}

fun RBuilder.split() {
    styledDiv {
        css { +SpaceStyles.split }
        spaceSplit()
    }
}
