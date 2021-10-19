package antd.collapse

import antd.ReactNode
import react.*

external interface CollapsePanelComponent : ComponentType<CollapsePanelProps>

external interface CollapsePanelProps : Props {
    var key: Any /* String | Number */
    var header: ReactNode
    var disabled: Boolean?
    var className: String?
    var style: dynamic
    var showArrow: Boolean?
    var prefixCls: String?
    var forceRender: Boolean?
    var id: String?
    var extra: ReactNode?
}
