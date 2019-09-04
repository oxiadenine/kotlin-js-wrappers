package antd.tooltip

import react.RBuilder
import react.RHandler

fun RBuilder.tooltip(handler: RHandler<TooltipProps>) = child(TooltipComponent::class, handler)
