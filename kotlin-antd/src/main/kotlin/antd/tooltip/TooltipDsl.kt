package antd.tooltip

import react.*

fun RBuilder.tooltip(handler: RHandler<TooltipProps>) = child(TooltipComponent::class, handler)
