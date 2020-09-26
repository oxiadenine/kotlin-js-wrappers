package antd.divider

import react.*

fun RBuilder.divider(handler: RHandler<DividerProps>) = child(DividerComponent::class, handler)
