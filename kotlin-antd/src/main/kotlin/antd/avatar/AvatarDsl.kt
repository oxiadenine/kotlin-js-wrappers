package antd.avatar

import react.RBuilder
import react.RHandler

fun RBuilder.avatar(handler: RHandler<AvatarProps>) = child(AvatarComponent::class, handler)
