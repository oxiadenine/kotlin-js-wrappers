package antd.table

import react.*

external object ColumnGroupComponent : Component<ColumnGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface ColumnGroupProps : RProps {
    var title: Any? /* String | ReactElement */
    var className: String?
}
