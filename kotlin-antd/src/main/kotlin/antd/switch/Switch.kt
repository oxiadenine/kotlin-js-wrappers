@file:JsModule("antd/lib/switch")
@file:JsNonModule

package antd.switch

import antd.RefAttributes
import antd.ReactNode
import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object SwitchComponent : Component<SwitchProps, State> {
    override fun render(): ReactElement?
}

external interface SwitchProps : RefAttributes<HTMLElement>, RProps {
    var prefixCls: String?
    var size: SwitchSize?
    var className: String?
    var checked: Boolean?
    var defaultChecked: Boolean?
    var onChange: SwitchChangeEventHandler?
    var onClick: SwitchClickEventHandler?
    var checkedChildren: ReactNode?
    var unCheckedChildren: ReactNode?
    var disabled: Boolean?
    var loading: Boolean?
    var autoFocus: Boolean?
    var style: dynamic
    var title: String?
}
