package samples.tooltip

import antd.button.button
import antd.tooltip.tooltip
import kotlinext.js.js
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val wrapStyles = js {
    overflow = "hidden"
    position = "relative"
    padding = "24px"
    border = "1px solid #e9e9e9"
}

fun RBuilder.autoAdjustOverflow() {
    styledDiv {
        css { +TooltipStyles.autoAdjustOverflow }
        div {
            attrs.jsStyle = wrapStyles
            tooltip {
                attrs {
                    placement = "left"
                    title = "Prompt text"
                    getPopupContainer = { triggerNode -> triggerNode.parentElement as HTMLElement }
                }
                button { +"Adjust automatically / 自动调整" }
            }
            tooltip {
                attrs {
                    placement = "left"
                    title = "Prompt text"
                    getPopupContainer = { triggerNode -> triggerNode.parentElement as HTMLElement }
                    autoAdjustOverflow = false
                }
                button { +"Ingore / 不处理" }
            }
        }
    }
}
