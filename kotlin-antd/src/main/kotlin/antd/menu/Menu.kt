@file:JsModule("antd/lib/menu")
@file:JsNonModule

package antd.menu

import antd.HTMLAttributes
import antd.MouseEvent
import org.w3c.dom.*
import react.*

@JsName("default")
external object MenuComponent : Component<MenuProps, RState> {
    val Divider: DividerComponent
    val Item: MenuItemComponent
    val SubMenu: SubMenuComponent
    val ItemGroup: MenuItemGroupComponent

    override fun render(): ReactElement?
}

external interface MenuProps : RcMenuProps, RProps {
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
    var onOpenChange: ((openKeys: Array<Key>) -> Unit)?
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
    var overflowedIndicator: Any? /* String | ReactElement */
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
    var key: String
    var keyPath: Array<String>
    var item: ReactInstance
    var domEvent: MouseEvent<HTMLElement>
}

external interface SelectInfo : MenuInfo {
    var selectedKeys: Array<String>?
}

external interface HoverEventHandlerInfo {
    var key: String
    var hover: Boolean
}

external interface MenuHoverEventHandlerInfo {
    var key: String
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
