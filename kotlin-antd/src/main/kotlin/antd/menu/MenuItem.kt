package antd.menu

import org.w3c.dom.events.MouseEvent
import react.*

external object MenuItemComponent : Component<MenuItemProps, MenuState> {
    override fun render(): ReactElement?
}

external interface MenuItemProps : RProps {
    var rootPrefixCls: String?
    var disabled: Boolean?
    var level: Number?
    var title: Any? /* ReactElement | String */
    var children: ReactElement?
    var className: String?
    var style: dynamic
    var onClick: ((param: ClickParam) -> Unit)?
    var onMouseEnter: ((e: ItemClickParam) -> Unit)?
    var onMouseLeave: ((e: ItemClickParam) -> Unit)?
}

external interface ItemClickParam {
    var key: String
    var domEvent: MouseEvent
}
