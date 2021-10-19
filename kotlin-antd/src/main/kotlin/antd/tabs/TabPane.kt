package antd.tabs

import antd.ReactNode
import react.*

external interface TabPaneComponent : ComponentType<TabPaneProps>

external interface TabPaneProps : Props {
    var tab: ReactNode?
    var className: String?
    var style: dynamic
    var disabled: Boolean?
    var children: ReactNode?
    var forceRender: Boolean?
    var closable: Boolean?
    var closeIcon: ReactNode?
    var prefixCls: String?
    var tabKey: String?
    var id: String?
    var animated: Boolean?
    var active: Boolean?
    var destroyInactiveTabPane: Boolean?
}
