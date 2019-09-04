package antd.tag

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object CheckableTagComponent : Component<CheckableTagProps, RState> {
    override fun render(): ReactElement?
}

external interface CheckableTagProps : RProps {
    var prefixCls: String?
    var className: String?
    var checked: Boolean
    var onChange: ((checked: Boolean) -> Unit)?
}
