package antd.list

import antd.*
import org.w3c.dom.*
import react.*

external object ListItemComponent : Component<ListItemProps, RState> {
    val Meta: ListItemMetaComponent

    override fun render(): ReactElement?
}

external interface ListItemProps : HTMLAttributes<HTMLDivElement>, RProps {
    override var className: String?
    override var children: Any? /* String | ReactElement */
    var prefixCls: String?
    override var style: dynamic
    var extra: Any? /* String | ReactElement */
    var actions: Array<Any /* String | ReactElement */>?
    var grid: ListGridType?
}
