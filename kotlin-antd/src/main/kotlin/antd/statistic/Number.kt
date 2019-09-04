package antd.statistic

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object NumberComponent : Component<NumberProps, RState> {
    override fun render(): ReactElement?
}

external interface NumberProps : FormatConfig, RProps {
    var value: ValueType
}
