package antd.input

import react.Component
import react.RState
import react.ReactElement

external object PasswordComponent : Component<PasswordProps, PasswordState> {
    override fun render(): ReactElement?
}

external interface PasswordProps : InputProps {
    val inputPrefixCls: String?
    val action: String?
    var visibilityToggle: Boolean?
}

external interface PasswordState : RState {
    var visible: Boolean
}
