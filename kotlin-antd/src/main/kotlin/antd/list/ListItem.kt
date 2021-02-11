package antd.list

import antd.*
import org.w3c.dom.*
import react.*

external object ItemComponent : Component<ListItemProps, RState> {
    val Meta: MetaComponent

    override fun render(): ReactElement?
}

external object MetaComponent : Component<ListItemMetaProps, RState> {
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
    var colStyle: dynamic
}

external interface ListItemMetaProps : RProps {
    var avatar: Any? /* String | ReactElement */
    var className: String?
    var children: Any? /* String | ReactElement */
    var description: Any? /* String | ReactElement */
    var prefixCls: String?
    var style: dynamic
    var title: Any? /* String | ReactElement */
}
