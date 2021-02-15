package antd.menu

import antd.configprovider.DirectionType
import react.RContext

external val menuContext: RContext<MenuContextProps>

external interface MenuContextProps {
    var inlineCollapsed: Boolean
    var antdMenuTheme: MenuTheme?
    var direction: DirectionType?
}
