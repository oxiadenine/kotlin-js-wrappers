package antd.drawer

import react.*

fun RBuilder.drawer(handler: RHandler<DrawerProps>) = child(DrawerComponent::class, handler)
