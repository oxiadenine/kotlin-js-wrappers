package antd.inputnumber

import react.RBuilder
import react.RHandler

fun RBuilder.inputNumber(handler: RHandler<InputNumberProps>) = child(InputNumberComponent::class, handler)
