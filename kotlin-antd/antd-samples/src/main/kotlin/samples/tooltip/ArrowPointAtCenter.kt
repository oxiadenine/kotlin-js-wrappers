package samples.tooltip

import antd.button.button
import antd.tooltip.tooltip
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.arrowPointAtCenter() {
    div("tooltip-container") {
        attrs.id = "tooltip-arrow-point-at-center"
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
