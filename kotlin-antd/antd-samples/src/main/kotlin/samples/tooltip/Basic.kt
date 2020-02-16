package samples.tooltip

import antd.tooltip.tooltip
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("tooltip-container") {
        attrs.id = "tooltip-basic"
        tooltip {
            attrs.title = "prompt text"
            span { +"Tooltip will show when mouse enter." }
        }
    }
}
