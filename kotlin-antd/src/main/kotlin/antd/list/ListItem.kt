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
    override var children: ReactNode?
    var prefixCls: String?
    override var style: dynamic
    var extra: ReactNode?
    var actions: Array<ReactNode>?
    var grid: ListGridType?
    var colStyle: dynamic
}

external interface ListItemMetaProps : RProps {
    var avatar: ReactNode?
    var className: String?
    var children: ReactNode?
    var description: ReactNode?
    var prefixCls: String?
    var style: dynamic
    var title: ReactNode?
}
