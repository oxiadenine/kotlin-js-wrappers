package antd.descriptions

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.descriptions(handler: RHandler<DescriptionsProps>) = child(DescriptionsComponent::class, handler)
fun RBuilder.descriptionsItem(handler: RHandler<DescriptionsItemProps>) = child(DescriptionsComponent.Item, jsObject {}, handler)
