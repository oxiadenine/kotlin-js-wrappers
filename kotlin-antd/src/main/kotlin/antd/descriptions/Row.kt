package antd.descriptions

import react.*

external object RowComponent : Component<RowProps, State> {
    override fun render(): ReactElement?
}

external interface RowProps : Props {
    var prefixCls: String
    var vertical: Boolean
    var row: ReactElement
    var bordered: Boolean?
    var colon: Boolean
    var index: Number
}
