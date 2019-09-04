package antd.table

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ColumnGroupComponent : Component<ColumnGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface ColumnGroupProps : RProps {
    var title: Any? /* String | ReactElement */
    var className: String?
}
