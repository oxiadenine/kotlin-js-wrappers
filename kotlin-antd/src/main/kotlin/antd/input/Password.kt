package antd.input

import antd.RefAttributes
import antd.ReactNode
import react.*

external interface PasswordComponent : ComponentType<PasswordProps>

external interface PasswordProps : InputProps, RefAttributes<dynamic> {
    val inputPrefixCls: String?
    val action: String?
    var visibilityToggle: Boolean?
    var iconRender: ((visible: Boolean) -> ReactNode)?
}
