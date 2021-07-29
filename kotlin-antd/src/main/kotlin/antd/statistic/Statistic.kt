@file:JsModule("antd/lib/statistic")
@file:JsNonModule

package antd.statistic

import antd.MouseEventHandler
import antd.ReactNode
import antd.configprovider.*
import org.w3c.dom.HTMLDivElement
import react.*

@JsName("default")
external object StatisticComponent : Component<StatisticProps, State> {
    val Countdown: CountdownComponent

    override fun render(): ReactElement?
}

external interface StatisticProps : FormatConfig, ConfigConsumerProps, RProps {
    override var prefixCls: String?
    var className: String?
    var style: dynamic
    var value: ValueType?
    var valueStyle: dynamic
    var valueRender: ((node: ReactNode) -> ReactNode)?
    var title: ReactNode?
    var prefix: ReactNode?
    var suffix: ReactNode?
    var loading: Boolean?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
}

external interface FormatConfig {
    var formatter: Formatter?
    var decimalSeparator: String?
    var groupSeparator: String?
    var precision: Number?
    var prefixCls: String?
}
