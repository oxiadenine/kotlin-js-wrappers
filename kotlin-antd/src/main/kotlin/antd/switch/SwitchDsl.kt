package antd.switch

import react.*

fun RBuilder.switch(handler: RHandler<SwitchProps>) = child(SwitchComponent::class, handler)
