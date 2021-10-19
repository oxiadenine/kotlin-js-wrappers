package antd.list

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

external interface ItemComponent : ComponentType<ListItemProps> {
    val Meta: MetaComponent
}

external interface MetaComponent : ComponentType<ListItemMetaProps>

external interface ListItemProps : HTMLAttributes<HTMLDivElement>, Props {
    override var className: String?
    override var children: Any?
    var prefixCls: String?
    override var style: dynamic
    var extra: ReactNode?
    var actions: Array<ReactNode>?
    var grid: ListGridType?
    var colStyle: dynamic
}

external interface ListItemMetaProps : Props {
    var avatar: ReactNode?
    var className: String?
    var children: ReactNode?
    var description: ReactNode?
    var prefixCls: String?
    var style: dynamic
    var title: ReactNode?
}
