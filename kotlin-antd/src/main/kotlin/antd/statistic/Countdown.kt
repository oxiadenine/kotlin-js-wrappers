package antd.statistic

import react.Component
import react.RState
import react.ReactElement

external object CountdownComponent : Component<CountdownProps, RState> {
    override fun render(): ReactElement?
}

external interface CountdownProps : StatisticProps {
    override var value: CountdownValueType?
    var format: String?
    var onFinish: (() -> Unit)?
}

external interface CountdownFormatConfig : FormatConfig {
    var format: String?
}
