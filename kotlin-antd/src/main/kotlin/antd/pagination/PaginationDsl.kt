package antd.pagination

import react.RBuilder
import react.RHandler

fun RBuilder.pagination(handler: RHandler<PaginationProps>) = child(PaginationComponent::class, handler)
