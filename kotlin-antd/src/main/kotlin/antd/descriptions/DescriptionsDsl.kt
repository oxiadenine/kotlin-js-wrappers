package antd.descriptions

import kotlinext.js.*
import react.*

fun RBuilder.descriptions(handler: RHandler<DescriptionsProps>) = child(DescriptionsComponent::class, handler)
fun RBuilder.descriptionsItem(handler: RHandler<DescriptionsItemProps>) = child(DescriptionsComponent.Item, jsObject {}, handler)
