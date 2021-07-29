package antd.statistic

import react.*

external object NumberComponent : Component<NumberProps, State> {
    override fun render(): ReactElement?
}

external interface NumberProps : FormatConfig, RProps {
    var value: ValueType
}
