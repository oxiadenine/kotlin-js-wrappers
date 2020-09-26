package antd.list

import react.*

external object ListItemMetaComponent : Component<ListItemMetaProps, RState> {
    override fun render(): ReactElement?
}

external interface ListItemMetaProps : RProps {
    var avatar: Any? /* String | ReactElement */
    var className: String?
    var children: ReactElement?
    var description: Any? /* String | ReactElement */
    var prefixCls: String?
    var style: dynamic
    var title: Any? /* String | ReactElement */
}
