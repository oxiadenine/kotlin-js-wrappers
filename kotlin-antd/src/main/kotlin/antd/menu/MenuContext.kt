package antd.menu

import antd.configprovider.DirectionType
import react.Context

external val menuContext: Context<MenuContextProps>

external interface MenuContextProps {
    var inlineCollapsed: Boolean
    var antdMenuTheme: MenuTheme?
    var direction: DirectionType?
}
