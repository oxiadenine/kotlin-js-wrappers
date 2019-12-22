package antd.list

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

inline fun <T, reified LC : ListComponent<T>> RBuilder.list(noinline handler: RHandler<ListProps<T>>) = child(LC::class, handler)
fun RBuilder.listItem(handler: RHandler<ListItemProps>) = child(ListComponent.Item, jsObject {}, handler)
fun RBuilder.listItemMeta(handler: RHandler<ListItemMetaProps>) = child(ListComponent.Item.Meta, jsObject {}, handler)
