package antd.switch

import react.RBuilder
import react.RHandler

fun RBuilder.switch(handler: RHandler<SwitchProps>) = child(SwitchComponent::class, handler)
