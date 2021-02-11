package antd.input

import react.*

external object PasswordComponent : Component<PasswordProps, RState> {
    override fun render(): ReactElement?
}

external interface PasswordProps : InputProps {
    val inputPrefixCls: String?
    val action: String?
    var visibilityToggle: Boolean?
    var iconRender: ((visible: Boolean) -> Any /* String | ReactElement */)?
}
