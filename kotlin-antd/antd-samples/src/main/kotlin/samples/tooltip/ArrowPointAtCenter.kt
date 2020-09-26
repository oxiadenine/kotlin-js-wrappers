package samples.tooltip

import antd.button.button
import antd.tooltip.*
import react.*
import react.dom.*
import styled.*

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
