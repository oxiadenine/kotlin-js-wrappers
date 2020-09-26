@file:JsModule("antd/lib/menu")
@file:JsNonModule

package antd.menu

import antd.layout.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import react.*

@JsName("default")
external object MenuComponent : Component<MenuProps, MenuState> {
    val Divider: MenuDividerComponent
    val Item: MenuItemComponent
    val SubMenu: SubMenuComponent
    val ItemGroup: MenuItemGroupComponent

    override fun render(): ReactElement?
}

external interface MenuProps : RProps {
    var id: String?
    var theme: MenuTheme?
    var mode: MenuMode?
    var selectable: Boolean?
    var selectedKeys: Array<String>?
    var defaultSelectedKeys: Array<String>?
    var openKeys: Array<String>?
    var defaultOpenKeys: Array<String>?
    var onOpenChange: ((openKeys: Array<String>) -> Unit)?
    var onSelect: ((param: SelectParam) -> Unit)?
    var onDeselect: ((param: SelectParam) -> Unit)?
    var onClick: ((param: ClickParam) -> Unit)?
    var style: dynamic
    var openAnimation: Any? /* String | Object */
    var openTransitionName: Any? /* String | Object */
    var className: String?
    var prefixCls: String?
    var multiple: Boolean?
    var inlineIndent: Number?
    var inlineCollapsed: Boolean?
    var subMenuCloseDelay: Number?
    var subMenuOpenDelay: Number?
    var focusable: Boolean?
    var onMouseEnter: ((e: MouseEvent) -> Unit)?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var overflowedIndicator: ReactElement?
    var forceSubMenuRender: Boolean?
}

external interface MenuState : RState {
    var openKeys: Array<String>
    var switchingModeFromInline: Boolean
    var inlineOpenKeys: Array<String>
    var prevProps: InternalMenuProps
    var mounted: Boolean
}

external interface InternalMenuProps : MenuProps, SiderContextProps

external interface SelectParam {
    var key: String
    var keyPath: Array<String>
    var item: Any
    var domEvent: Event
    var selectedKeys: Array<String>
}

external interface ClickParam {
    var key: String
    var keyPath: Array<String>
    var item: Any
    var domEvent: Event
}
