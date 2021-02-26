package antd.input

import antd.ReactNode
import antd.RefAttributes
import react.*

external object PasswordComponent : Component<PasswordProps, RState> {
    override fun render(): ReactElement?
}

external interface PasswordProps : InputProps, RefAttributes<dynamic> {
    val inputPrefixCls: String?
    val action: String?
    var visibilityToggle: Boolean?
    var iconRender: ((visible: Boolean) -> ReactNode)?
}
