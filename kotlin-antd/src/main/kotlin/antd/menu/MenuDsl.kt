package antd.menu

import kotlinext.js.*
import react.*

fun RBuilder.menu(handler: RHandler<MenuProps>) = child(MenuComponent::class, handler)
fun RBuilder.divider(handler: RHandler<Props>) = child(MenuComponent.Divider, jso {}, handler)
fun RBuilder.menuItem(handler: RHandler<MenuItemProps>) = child(MenuComponent.Item, jso {}, handler)
fun RBuilder.subMenu(handler: RHandler<SubMenuProps>) = child(MenuComponent.SubMenu, jso {}, handler)
fun RBuilder.menuItemGroup(handler: RHandler<MenuItemGroupProps>) = child(MenuComponent.ItemGroup, jso {}, handler)

