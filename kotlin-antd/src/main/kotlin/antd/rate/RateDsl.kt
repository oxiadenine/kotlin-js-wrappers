package antd.rate

import react.*

fun RBuilder.rate(handler: RHandler<RateProps>) = child(RateComponent::class, handler)
