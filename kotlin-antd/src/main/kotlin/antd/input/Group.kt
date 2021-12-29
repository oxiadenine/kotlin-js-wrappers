package antd.input

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

external interface GroupComponent : ComponentClass<GroupProps>

external interface GroupProps : Props {
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
