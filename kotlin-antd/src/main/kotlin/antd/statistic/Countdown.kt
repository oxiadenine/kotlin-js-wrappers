package antd.statistic

import react.*

external object CountdownComponent : Component<CountdownProps, RState> {
    override fun render(): ReactElement?
}

external interface CountdownProps : StatisticProps {
    override var value: CountdownValueType?
    var format: String?
    var onFinish: (() -> Unit)?
}
