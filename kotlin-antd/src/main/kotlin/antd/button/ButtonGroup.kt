package antd.button

import antd.configprovider.SizeType
import react.*

external object ButtonGroupComponent : Component<ButtonGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface ButtonGroupProps : RProps {
    var size: SizeType?
    var style: dynamic
    var className: String?
    var prefixCls: String?
}
