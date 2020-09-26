package antd.icon

import react.*

fun RBuilder.icon(handler: RHandler<IconProps>) = child(IconComponent::class, handler)
