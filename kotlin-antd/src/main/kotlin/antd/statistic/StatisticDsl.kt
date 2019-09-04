package antd.statistic

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.statistic(handler: RHandler<StatisticProps>) = child(StatisticComponent::class, handler)
fun RBuilder.countdown(handler: RHandler<CountdownProps>) = child(StatisticComponent.Countdown, jsObject {}, handler)
