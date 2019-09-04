package antd.breadcrumb

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.breadcrumb(handler: RHandler<BreadcrumbProps>) = child(BreadcrumbComponent::class, handler)
fun RBuilder.breadcrumbItem(handler: RHandler<BreadcrumbItemProps>) = child(BreadcrumbComponent.Item, jsObject {}, handler)
