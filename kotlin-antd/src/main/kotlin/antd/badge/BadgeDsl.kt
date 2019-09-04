package antd.badge

import react.RBuilder
import react.RHandler

fun RBuilder.badge(handler: RHandler<BadgeProps>) = child(BadgeComponent::class, handler)
