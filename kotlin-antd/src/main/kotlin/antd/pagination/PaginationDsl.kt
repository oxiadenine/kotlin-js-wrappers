package antd.pagination

import react.*

fun RBuilder.pagination(handler: RHandler<PaginationProps>) = child(PaginationComponent::class, handler)
