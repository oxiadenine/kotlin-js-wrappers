package antd.rate

import react.RBuilder
import react.RHandler

fun RBuilder.rate(handler: RHandler<RateProps>) = child(RateComponent::class, handler)
