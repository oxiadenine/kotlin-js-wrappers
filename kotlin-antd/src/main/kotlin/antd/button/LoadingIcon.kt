package antd.button

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object LoadingIconComponent : Component<LoadingIconProps, RState> {
    override fun render(): ReactElement?
}

external interface LoadingIconProps : RProps {
    var prefixCls: String
    var existIcon: Boolean
    var loading: Any? /* Boolean | Object */
}
