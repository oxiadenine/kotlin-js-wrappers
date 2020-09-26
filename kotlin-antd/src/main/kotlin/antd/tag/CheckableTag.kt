package antd.tag

import react.*

external object CheckableTagComponent : Component<CheckableTagProps, RState> {
    override fun render(): ReactElement?
}

external interface CheckableTagProps : RProps {
    var prefixCls: String?
    var className: String?
    var checked: Boolean
    var onChange: ((checked: Boolean) -> Unit)?
}
