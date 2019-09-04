package antd.backtop

import react.RBuilder
import react.RHandler

fun RBuilder.backTop(handler: RHandler<BackTopProps>) = child(BackTopComponent::class, handler)
