package antd.popover

import react.*

fun RBuilder.popover(handler: RHandler<PopoverProps>) = child(PopoverComponent::class, handler)
