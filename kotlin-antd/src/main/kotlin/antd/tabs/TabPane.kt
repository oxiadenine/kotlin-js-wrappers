package antd.tabs

import react.*

external object TabPaneComponent : Component<TabPaneProps, RState> {
    override fun render(): ReactElement?
}

external interface TabPaneProps : RProps {
    var tab: Any? /* String | ReactElement */
    var className: String?
    var style: dynamic
    var disabled: Boolean?
    var children: Any? /* String | ReactElement */
    var forceRender: Boolean?
    var closable: Boolean?
    var closeIcon: Any? /* String | ReactElement */
    var prefixCls: String?
    var tabKey: String?
    var id: String?
    var animated: Boolean?
    var active: Boolean?
    var destroyInactiveTabPane: Boolean?
}
