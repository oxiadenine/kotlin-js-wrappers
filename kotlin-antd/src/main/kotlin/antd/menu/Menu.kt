@file:JsModule("antd/lib/menu")
@file:JsNonModule

package antd.menu

import antd.HTMLAttributes
import antd.Key
import antd.MouseEvent
import antd.ReactInstance
import antd.ReactNode
import org.w3c.dom.*
import react.*

@JsName("default")
external object MenuComponent : Component<MenuProps, State> {
    val Divider: DividerComponent
    val Item: MenuItemComponent
    val SubMenu: SubMenuComponent
    val ItemGroup: MenuItemGroupComponent

    override fun render(): ReactElement?
}

external interface MenuProps : RcMenuProps, Props {
    var theme: MenuTheme?
    var inlineIndent: Number?
    var focusable: Boolean?
}

external interface RcMenuProps : HTMLAttributes<HTMLDivElement> {
    var defaultSelectedKeys: Array<String>?
    var defaultActiveFirst: Boolean?
    var selectedKeys: Array<String>?
    var defaultOpenKeys: Array<String>?
    var openKeys: Array<String>?
    var mode: MenuMode?
    var getPopupContainer: ((node: HTMLElement) -> HTMLElement)?
    override var onClick: dynamic /* MenuClickEventHandler */
    override var onSelect: dynamic /* SelectEventHandler */
    var onOpenChange: ((openKeys: Array<dynamic>) -> Unit)?
    var onDeselect: SelectEventHandler?
    var onDestroy: DestroyEventHandler?
    var subMenuOpenDelay: Number?
    var subMenuCloseDelay: Number?
    var forceSubMenuRender: Boolean?
    var triggerSubMenuAction: TriggerSubMenuAction?
    var level: Number?
    var selectable: Boolean?
    var multiple: Boolean?
    var activeKey: String?
    var prefixCls: String?
    var builtinPlacements: BuiltinPlacements?
    var itemIcon: RenderIconType?
    var expandIcon: RenderIconType?
    var overflowedIndicator: ReactNode?
    var motion: dynamic
    var defaultMotions: dynamic
    var openTransitionName: String?
    var openAnimation: OpenAnimation?
    var direction: String? /* "ltr" | "rtl" */
    var inlineCollapsed: Boolean?
    var siderCollapsed: Boolean?
    var collapsedWidth: Any? /* String | Number */
}

external interface MenuInfo {
    var key: Key
    var keyPath: Array<Key>
    var item: dynamic
    var domEvent: MouseEvent<HTMLElement>
}

external interface SelectInfo : MenuInfo {
    var selectedKeys: Array<String>?
}

external interface HoverEventHandlerInfo {
    var key: Key
    var hover: Boolean
}

external interface MenuHoverEventHandlerInfo {
    var key: Key
    var domEvent: MouseEvent<HTMLElement>
}

external interface OpenEventHandlerInfo {
    var key: Key
    var item: ReactInstance
    var trigger: String
    var open: Boolean
}

external interface MiniStore {
    var getState: () -> Any
    var setState: (state: Any) -> Unit
    var subscribe: (listener: () -> Unit) -> () -> Unit
}
