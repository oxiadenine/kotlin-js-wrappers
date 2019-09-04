package antd.menu

import react.*

external object MenuItemGroupComponent : Component<MenuItemGroupProps, MenuState> {
    override fun render(): ReactElement?
}

external interface MenuItemGroupProps : RProps {
    var title: Any? /* String | ReactElement */
    var children: ReactElement?
}
