package antd.anchor

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.anchor(handler: RHandler<AnchorProps>) = child(AnchorComponent::class, handler)
fun RBuilder.anchorLink(hanler: RHandler<AnchorLinkProps>) = child(AnchorComponent.Link, jsObject {}, hanler)
