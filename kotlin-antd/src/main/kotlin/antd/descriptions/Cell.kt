package antd.descriptions

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object CellComponent : Component<CellProps, RState> {
    override fun render(): ReactElement?
}

external interface CellProps : RProps {
    var itemPrefixCls: String
    var span: Number
    var className: String?
    var component: String
    var style: dynamic
    var bordered: Boolean?
    var label: Any? /* String | ReactElement */
    var content: Any? /* String | ReactElement */
    var colon: Boolean?
}
