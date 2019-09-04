package antd.collapse

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object CollapsePanelComponent : Component<CollapsePanelProps, RState> {
    override fun render(): ReactElement?
}

external interface CollapsePanelProps : RProps {
    var key: String
    var header: Any /* String | ReactElement */
    var disabled: Boolean?
    var className: String?
    var style: dynamic
    var showArrow: Boolean?
    var prefixCls: String?
    var forceRender: Boolean?
    var id: String?
    var extra: Any? /* String | ReactElement */
}
