package samples.tooltip

import antd.tooltip.tooltip
import react.RBuilder
import react.dom.span
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +TooltipStyles.basic }
        tooltip {
            attrs.title = "prompt text"
            span { +"Tooltip will show when mouse enter." }
        }
    }
}
