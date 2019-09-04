package antd.breadcrumb

import antd.MouseEventHandler
import react.*

external object BreadcrumbItemComponent : Component<BreadcrumbItemProps, RState> {
    override fun render(): ReactElement?
}

external interface BreadcrumbItemProps : RProps {
    var prefixCls: String?
    var separator: Any? /* String | ReactElement */
    var href: String?
    var overlay: Any? /* String | ReactElement */
    var onClick: MouseEventHandler<Any /* HTMLAnchorElement | HTMLSpanElement */>?
}
