package antd.menu

import react.*

external interface DividerComponent : ComponentType<DividerProps>

external interface DividerProps : RProps {
    var className: String?
    var rootPrefixCls: String?
    var style: dynamic
    var disabled: Boolean
}
