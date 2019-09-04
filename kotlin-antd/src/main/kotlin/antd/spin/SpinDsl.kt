package antd.spin

import react.RBuilder
import react.RHandler

fun RBuilder.spin(handler: RHandler<SpinProps>) = child(SpinComponent::class, handler)
