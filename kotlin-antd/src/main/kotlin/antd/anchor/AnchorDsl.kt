package antd.anchor

import kotlinext.js.*
import react.*

fun RBuilder.anchor(handler: RHandler<AnchorProps>) = child(AnchorComponent::class, handler)
fun RBuilder.anchorLink(hanler: RHandler<AnchorLinkProps>) = child(AnchorComponent.Link, jsObject {}, hanler)
