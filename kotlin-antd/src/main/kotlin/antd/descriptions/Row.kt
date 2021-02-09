package antd.descriptions

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object RowComponent : Component<RowProps, RState> {
    override fun render(): ReactElement?
}

external interface RowProps : RProps {
    var prefixCls: String
    var vertical: Boolean
    var row: ReactElement
    var bordered: Boolean?
    var colon: Boolean
    var index: Number
}
