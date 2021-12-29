package antd.breadcrumb

import antd.*
import antd.ReactNode
import antd.dropdown.DropdownProps
import react.*

external interface BreadcrumbItemComponent : ComponentClass<BreadcrumbItemProps>

external interface BreadcrumbItemProps : Props {
    var prefixCls: String?
    var separator: ReactNode?
    var href: String?
    var overlay: Any? /* String | ReactElement */
    var dropdownProps: DropdownProps?
    var onClick: MouseEventHandler<Any /* HTMLAnchorElement | HTMLSpanElement */>?
}
