package antd.drawer

import react.RBuilder
import react.RHandler

fun RBuilder.drawer(handler: RHandler<DrawerProps>) = child(DrawerComponent::class, handler)
