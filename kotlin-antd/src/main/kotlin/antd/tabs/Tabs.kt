@file:JsModule("antd/lib/tabs")

package antd.tabs

import antd.MouseEventHandler
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object TabsComponent : Component<TabsProps, RState> {
    val TabPane: TabPaneComponent

    override fun render(): ReactElement?
}

external interface TabsProps : RProps {
    var activeKey: String?
    var defaultActiveKey: String?
    var hideAdd: Boolean?
    var onChange: ((activeKey: String) -> Unit)?
    var onTabClick: Function<Unit>?
    var onPrevClick: MouseEventHandler<HTMLElement>?
    var onNextClick: MouseEventHandler<HTMLElement>?
    var tabBarExtraContent: Any? /* String | ReactElement */
    var tabBarStyle: dynamic
    var type: TabsType?
    var tabPosition: TabsPosition?
    var onEdit: ((targetKey: Any /* String | MouseEvent<HTMLElement> */, action: TabsEditAction) -> Unit)?
    var size: TabsSize?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    var animated: Any? /* Boolean | TabsAnimation */
    var tabBarGutter: Number?
    var renderTabBar: ((props: TabsProps, defaultTabBar: ReactElement) -> Any /* String | ReactElement */)?
    var destroyInactiveTabPane: Boolean?
}

external interface TabsAnimation {
    var inkBar: Boolean
    var tabPane: Boolean
}
