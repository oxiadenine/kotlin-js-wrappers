package antd.icon

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.icon(handler: RHandler<IconProps>) = child(IconComponent::class, handler)
