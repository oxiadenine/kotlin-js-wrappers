package antd.statistic

import kotlinext.js.*
import react.*

fun RBuilder.statistic(handler: RHandler<StatisticProps>) = child(StatisticComponent::class, handler)
fun RBuilder.countdown(handler: RHandler<CountdownProps>) = child(StatisticComponent.Countdown, jsObject {}, handler)
