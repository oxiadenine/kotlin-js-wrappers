package antd.popover

import react.RBuilder
import react.RHandler

fun RBuilder.popover(handler: RHandler<PopoverProps>) = child(PopoverComponent::class, handler)
