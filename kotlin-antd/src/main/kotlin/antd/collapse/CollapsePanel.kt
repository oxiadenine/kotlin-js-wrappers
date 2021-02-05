package antd.collapse

import react.*

external object CollapsePanelComponent : Component<CollapsePanelProps, RState> {
    override fun render(): ReactElement?
}

external interface CollapsePanelProps : RProps {
    var key: Any /* String | Number */
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
