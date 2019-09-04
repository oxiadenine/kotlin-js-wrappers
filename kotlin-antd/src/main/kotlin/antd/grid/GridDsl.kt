package antd.grid

import react.RBuilder
import react.RHandler

fun RBuilder.col(handler: RHandler<ColProps>) = child(ColComponent::class, handler)
fun RBuilder.row(handler: RHandler<RowProps>) = child(RowComponent::class, handler)
