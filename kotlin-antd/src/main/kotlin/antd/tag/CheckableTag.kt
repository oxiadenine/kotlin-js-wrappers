package antd.tag

import antd.MouseEvent
import org.w3c.dom.HTMLSpanElement
import react.*

external interface CheckableTagComponent : ComponentType<CheckableTagProps>

external interface CheckableTagProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: String?
    var checked: Boolean
    var onChange: ((checked: Boolean) -> Unit)?
    var onClick: ((e: MouseEvent<HTMLSpanElement>) -> Unit)?
}
