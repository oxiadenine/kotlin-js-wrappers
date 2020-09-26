package antd.pageheader

import react.*

fun RBuilder.pageHeader(handler: RHandler<PageHeaderProps>) = child(PageHeaderComponent::class, handler)
