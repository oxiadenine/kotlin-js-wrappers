package antd.table

import react.*

external object BodyRowComponent : Component<BodyRowProps, BodyRowState> {
    override fun render(): ReactElement?
}

external interface BodyRowProps : RProps {
    var store: Store
    var className: String?
    var rowKey: String
    var prefixCls: String
}

external interface BodyRowState : RState {
    var selected: Boolean
}

external fun createTableRow(component: dynamic): BodyRowComponent
