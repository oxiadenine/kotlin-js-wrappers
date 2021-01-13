package antd.avatar

import kotlinext.js.jsObject
import react.*

fun RBuilder.avatar(handler: RHandler<AvatarProps>) = child(AvatarComponent::class, handler)
fun RBuilder.avatarGroup(handler: RHandler<GroupProps>) = child(AvatarComponent.Group, jsObject {}, handler)
