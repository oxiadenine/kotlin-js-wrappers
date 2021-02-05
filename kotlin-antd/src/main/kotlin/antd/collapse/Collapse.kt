@file:JsModule("antd/lib/collapse")
@file:JsNonModule

package antd.collapse

import react.*

@JsName("default")
external object CollapseComponent : Component<CollapseProps, RState> {
    val Panel: CollapsePanelComponent

    override fun render(): ReactElement?
}

external interface CollapseProps : RProps {
    var activeKey: Any? /* Array<String | Number> | String | Number */
    var defaultActiveKey: Any? /* Array<String | Number> | String | Number */
    var accordion: Boolean?
    var destroyInactivePanel: Boolean?
    var onChange: ((key: Any /* String | Array<String> */) -> Unit)?
    var style: dynamic
    var className: String?
    var bordered: Boolean?
    var prefixCls: String?
    var expandIcon: ((panelProps: PanelProps) -> Any /* String | ReactElement */)?
    var expandIconPosition: ExpandIconPosition?
    var ghost: Boolean?
}

external interface PanelProps {
    var isActive: Boolean?
    var header: Any? /* String | ReactElement */
    var className: String?
    var style: dynamic
    var showArrow: Boolean?
    var forceRender: Boolean?
    var disabled: Boolean?
    var extra: Any? /* String | ReactElement */
}
