package samples.tooltip

import antd.button.button
import antd.tooltip.*
import kotlinx.css.*
import kotlinx.css.properties.border
import org.w3c.dom.*
import react.*
import styled.*

private object AutoAdjustOverflowStyles : StyleSheet("auto-adjust-overflow", isStatic = true) {
    val wrapStyle by css {
        overflow = Overflow.hidden
        position = Position.relative
        padding(24.px)
        border(1.px, BorderStyle.solid, Color("#e9e9e9"))
    }
}

fun RBuilder.autoAdjustOverflow() {
    styledDiv {
        css { +TooltipStyles.autoAdjustOverflow }
        styledDiv {
            css { +AutoAdjustOverflowStyles.wrapStyle }
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
