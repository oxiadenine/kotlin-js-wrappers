package antd.badge

import react.*

fun RBuilder.badge(handler: RHandler<BadgeProps>) = child(BadgeComponent::class, handler)
