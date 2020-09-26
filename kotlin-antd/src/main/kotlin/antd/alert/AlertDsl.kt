package antd.alert

import react.*

fun RBuilder.alert(handler: RHandler<AlertProps>) = child(AlertComponent::class, handler)
