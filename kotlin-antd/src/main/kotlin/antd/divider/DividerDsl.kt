package antd.divider

import react.RBuilder
import react.RHandler

fun RBuilder.divider(handler: RHandler<DividerProps>) = child(DividerComponent::class, handler)
