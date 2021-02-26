package antd.input

import antd.*
import org.w3c.dom.*
import react.*

external object GroupComponent : Component<GroupProps, RState> {
    override fun render(): ReactElement?
}

external interface GroupProps : RProps {
    var className: String?
    var size: String? /* "large" | "small" | "default" */
    var children: ReactNode?
    var style: dynamic
    var onMouseEnter: MouseEventHandler<HTMLSpanElement>?
    var onMouseLeave: MouseEventHandler<HTMLSpanElement>?
    var onFocus: FocusEventHandler<HTMLSpanElement>?
    var onBlur: FocusEventHandler<HTMLSpanElement>?
    var prefixCls: String?
    var compact: Boolean?
}
