package antd.button

import kotlinext.js.*
import react.*

fun RBuilder.button(handler: RHandler<ButtonProps>) = child(ButtonComponent::class, handler)
fun RBuilder.buttonGroup(handler: RHandler<ButtonGroupProps>) = child(ButtonComponent.Group, jso {}, handler)
