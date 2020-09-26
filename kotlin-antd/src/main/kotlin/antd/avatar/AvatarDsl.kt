package antd.avatar

import react.*

fun RBuilder.avatar(handler: RHandler<AvatarProps>) = child(AvatarComponent::class, handler)
