package antd.empty

import react.RBuilder
import react.RHandler

fun RBuilder.empty(handler: RHandler<EmptyProps>) = child(EmptyComponent::class, handler)
