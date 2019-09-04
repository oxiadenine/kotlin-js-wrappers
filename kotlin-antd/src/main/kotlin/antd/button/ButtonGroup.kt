package antd.button

import react.*

external object ButtonGroupComponent : Component<ButtonGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface ButtonGroupProps : RProps {
    var size: ButtonSize?
    var style: dynamic
    var className: String?
    var prefixCls: String?
}
