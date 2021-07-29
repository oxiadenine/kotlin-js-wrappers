package samples.tooltip

import antd.button.button
import antd.tooltip.tooltip
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.arrowPointAtCenter() {
    styledDiv {
        css { +TooltipStyles.arrowPointAtCenter }
        div {
            tooltip {
                attrs {
                    placement = "topLeft"
                    title = "Prompt text"
                }
                button { +"Align edge / 边缘对齐" }
            }
            tooltip {
                attrs {
                    placement = "topLeft"
                    title = "Prompt text"
                    arrowPointAtCenter = true
                }
                button { +"Arrow points to center / 箭头指向中心" }
            }
        }
    }
}
