package antd.list

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.list(handler: RHandler<ListProps<Any>>) = child(ListComponent::class, handler)
fun RBuilder.listItem(handler: RHandler<ListItemProps>) = child(ListComponent.Item, jsObject {}, handler)
fun RBuilder.listItemMeta(handler: RHandler<ListItemMetaProps>) = child(ListComponent.Item.Meta, jsObject {}, handler)
