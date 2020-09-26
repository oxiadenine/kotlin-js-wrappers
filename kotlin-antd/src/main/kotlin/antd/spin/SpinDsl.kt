package antd.spin

import react.*

fun RBuilder.spin(handler: RHandler<SpinProps>) = child(SpinComponent::class, handler)
