package antd.statistic

import react.*

external interface CountdownComponent : ComponentClass<CountdownProps>

external interface CountdownProps : StatisticProps {
    override var value: CountdownValueType?
    var format: String?
    var onFinish: (() -> Unit)?
}
