package antd.button

import react.*

external object LoadingIconComponent : Component<LoadingIconProps, State> {
    override fun render(): ReactElement?
}

external interface LoadingIconProps : RProps {
    var prefixCls: String
    var existIcon: Boolean
    var loading: Any? /* Boolean | Object */
}
