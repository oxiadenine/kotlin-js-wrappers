@file:JsModule("antd/lib/switch")
@file:JsNonModule

package antd.switch

import org.w3c.dom.events.MouseEvent
import react.*

@JsName("default")
external object SwitchComponent : Component<SwitchProps, RState> {
    override fun render(): ReactElement?
}

external interface SwitchProps : RProps {
    var prefixCls: String?
    var size: SwitchSize?
    var className: String?
    var checked: Boolean?
    var defaultChecked: Boolean?
    var onChange: ((checked: Boolean, event: MouseEvent) -> Unit)?
    var onClick: ((checked: Boolean, event: MouseEvent) -> Unit)?
    var checkedChildren: Any? /* String | ReactElement */
    var unCheckedChildren: Any? /* String | ReactElement */
    var disabled: Boolean?
    var loading: Boolean?
    var autoFocus: Boolean?
    var style: dynamic
    var title: String?
}
