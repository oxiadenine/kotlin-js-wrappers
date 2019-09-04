package antd.pageheader

import react.RBuilder
import react.RHandler

fun RBuilder.pageHeader(handler: RHandler<PageHeaderProps>) = child(PageHeaderComponent::class, handler)
