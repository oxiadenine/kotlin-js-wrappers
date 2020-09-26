package samples.tooltip

import antd.tooltip.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +TooltipStyles.basic }
        tooltip {
            attrs.title = "prompt text"
            span { +"Tooltip will show when mouse enter." }
        }
    }
}
