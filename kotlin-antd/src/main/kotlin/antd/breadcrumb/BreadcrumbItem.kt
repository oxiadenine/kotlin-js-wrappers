package antd.breadcrumb

import antd.*
import antd.dropdown.DropdownProps
import react.*

external object BreadcrumbItemComponent : Component<BreadcrumbItemProps, RState> {
    override fun render(): ReactElement?
}

external interface BreadcrumbItemProps : RProps {
    var prefixCls: String?
    var separator: ReactNode?
    var href: String?
    var overlay: Any? /* String | ReactElement */
    var dropdownProps: DropdownProps?
    var onClick: MouseEventHandler<Any /* HTMLAnchorElement | HTMLSpanElement */>?
}
