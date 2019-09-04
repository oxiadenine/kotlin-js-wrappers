package antd.mention

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.mention(handler: RHandler<MentionProps>) = child(MentionComponent::class, handler)
fun RBuilder.nav(handler: RHandler<NavProps>) = child(MentionComponent.Nav, jsObject {}, handler)
