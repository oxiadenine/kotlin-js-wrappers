package samples.tooltip

import antd.button.button
import antd.tooltip.*
import kotlinext.js.*
import org.w3c.dom.*
import react.*
import react.dom.*
import styled.*

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
