package antd.menu

import kotlinext.js.*
import react.*

fun RBuilder.menu(handler: RHandler<MenuProps>) = child(MenuComponent::class, handler)
fun RBuilder.menuItem(handler: RHandler<MenuItemProps>) = child(MenuComponent.Item, jsObject {}, handler)
fun RBuilder.subMenu(handler: RHandler<SubMenuProps>) = child(MenuComponent.SubMenu, jsObject {}, handler)
fun RBuilder.menuItemGroup(handler: RHandler<MenuItemGroupProps>) = child(MenuComponent.ItemGroup, jsObject {}, handler)
fun RBuilder.menuDivider(handler: RHandler<RProps>) = child(MenuComponent.Divider, jsObject {}, handler)
