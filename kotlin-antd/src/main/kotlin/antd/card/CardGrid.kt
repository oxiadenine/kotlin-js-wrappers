package antd.card

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object CardGridComponent : Component<CardGridProps, RState> {
    override fun render(): ReactElement?
}

external interface CardGridProps : RProps {
    var prefixCls: String?
    var style: dynamic
    var className: String?
}
