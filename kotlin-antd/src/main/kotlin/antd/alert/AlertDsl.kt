package antd.alert

import react.RBuilder
import react.RHandler

fun RBuilder.alert(handler: RHandler<AlertProps>) = child(AlertComponent::class, handler)
