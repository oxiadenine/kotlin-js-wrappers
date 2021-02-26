@file:JsModule("antd/lib/tabs")
@file:JsNonModule

package antd.tabs

import antd.*
import antd.configprovider.SizeType
import org.w3c.dom.*
import react.*

@JsName("default")
external object TabsComponent : Component<TabsProps, RState> {
    val TabPane: TabPaneComponent

    override fun render(): ReactElement?
}

external interface TabsProps : RcTabProps, RProps {
    var type: TabsType?
    var size: SizeType?
    var hideAdd: Boolean?
    var centered: Boolean?
    var addIcon: ReactNode?
    var onEdit: ((e: Any /* MouseEvent<Any> | KeyboardEvent<Any> | String */, action: String /* "add" | "remove" */) -> Unit)?
}

external interface RcTabProps : HTMLAttributes<HTMLDivElement> {
    var prefixCls: String?
    override var className: String?
    override var style: dynamic
    override var children: ReactNode?
    override var id: String?
    var activeKey: String?
    var defaultActiveKey: String?
    var direction: String? /* "ltr" | "rtl" */
    var animated: Any? /* Boolean | AnimatedConfig */
    var renderTabBar: RenderTabBar?
    var tabBarExtraContent: TabBarExtraContent?
    var tabBarGutter: Number?
    var tabBarStyle: dynamic
    var tabPosition: TabPosition?
    var destroyInactiveTabPane: Boolean?
    override var onChange: dynamic /* (activeKey: String) -> Unit */
    var onTabClick: ((activeKey: String, e: Any /* KeyboardEvent<Any> | MouseEvent<Any> */) -> Unit)?
    var onTabScroll: OnTabScroll?
    var editable: EditableConfig?
    var locale: TabsLocale?
    var moreIcon: ReactNode?
    var moreTransitionName: String?
}

external interface TabOffset {
    var width: Number
    var height: Number
    var left: Number
    var right: Number
    var top: Number
}

external interface TabsLocale {
    var dropdownAriaLabel: String?
    var removeAriaLabel: String?
    var addAriaLabel: String?
}

external interface EditableConfig {
    var onEdit: (type: String /* "add" | "remove" */, info: EditableConfigOnEditInfo) -> Unit
    var showAdd: Boolean?
    var removeIcon: ReactNode?
    var addIcon: ReactNode?
}

external interface EditableConfigOnEditInfo {
    var key: String
    var event: Any /* MouseEvent<Any> | KeyboardEvent<Any> */
}

external interface AnimatedConfig {
    var inkBar: Boolean?
    var tabPane: Boolean?
}

external interface OnTabsScrollInfo {
    var direction: String /* "left" | "right" | "top" | "bottom" */
}
