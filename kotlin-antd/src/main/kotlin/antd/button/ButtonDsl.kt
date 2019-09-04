package antd.button

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.button(handler: RHandler<ButtonProps>) = child(ButtonComponent::class, handler)
fun RBuilder.buttonGroup(handler: RHandler<ButtonGroupProps>) = child(ButtonComponent.Group, jsObject {}, handler)
