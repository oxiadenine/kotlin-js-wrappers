package antd.menu

import react.*

external interface DividerComponent : ComponentClass<DividerProps>

external interface DividerProps : Props {
    var className: String?
    var rootPrefixCls: String?
    var style: dynamic
    var disabled: Boolean
}
