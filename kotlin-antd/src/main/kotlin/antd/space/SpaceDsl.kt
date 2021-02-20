package antd.space

import react.RBuilder
import react.RHandler

fun RBuilder.space(handler: RHandler<SpaceProps>) = child(SpaceComponent::class, handler)
