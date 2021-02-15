package antd.menu

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object DividerComponent : Component<DividerProps, RState> {
    override fun render(): ReactElement?
}

external interface DividerProps : RProps {
    var className: String?
    var rootPrefixCls: String?
    var style: dynamic
    var disabled: Boolean
}
