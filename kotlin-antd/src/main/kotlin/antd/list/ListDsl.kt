package antd.list

import kotlinext.js.*
import react.*

inline fun <T, reified LC : ListComponent<T>> RBuilder.list(noinline handler: RHandler<ListProps<T>>) = child(LC::class, handler)
fun RBuilder.listItem(handler: RHandler<ListItemProps>) = child(ListComponent.Item, jso {}, handler)
fun RBuilder.listItemMeta(handler: RHandler<ListItemMetaProps>) = child(ListComponent.Item.Meta, jso {}, handler)
