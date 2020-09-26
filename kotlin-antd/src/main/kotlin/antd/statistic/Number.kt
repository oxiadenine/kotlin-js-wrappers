package antd.statistic

import react.*

external object NumberComponent : Component<NumberProps, RState> {
    override fun render(): ReactElement?
}

external interface NumberProps : FormatConfig, RProps {
    var value: ValueType
}
