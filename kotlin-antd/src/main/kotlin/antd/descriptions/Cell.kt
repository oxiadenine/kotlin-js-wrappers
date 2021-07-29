package antd.descriptions

import antd.ReactNode
import react.*

external object CellComponent : Component<CellProps, State> {
    override fun render(): ReactElement?
}

external interface CellProps : RProps {
    var itemPrefixCls: String
    var span: Number
    var className: String?
    var component: String
    var style: dynamic
    var bordered: Boolean?
    var label: ReactNode?
    var content: ReactNode?
    var colon: Boolean?
}
