package antd.empty

import react.*

fun RBuilder.empty(handler: RHandler<EmptyProps>) = child(EmptyComponent::class, handler)
