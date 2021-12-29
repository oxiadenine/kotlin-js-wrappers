package antd.menu

import antd.ReactNode
import react.*

external interface MenuItemGroupComponent : ComponentClass<MenuItemGroupProps>

external interface MenuItemGroupProps : Props {
    var renderMenuItem: ((item: ReactElement, index: Number, key: String) -> ReactElement)?
    var index: Number?
    var className: String?
    var subMenuKey: String?
    var rootPrefixCls: String?
    var title: ReactNode?
    var onClick: MenuClickEventHandler?
    var direction: String? /* "ltr" | "rtl" */
}
