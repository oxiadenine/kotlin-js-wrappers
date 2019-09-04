package antd.radio

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.radio(handler: RHandler<RadioProps>) = child(RadioComponent::class, handler)
fun RBuilder.radioGroup(handler: RHandler<RadioGroupProps>) = child(RadioComponent.Group, jsObject {}, handler)
fun RBuilder.radioButton(handler: RHandler<RadioButtonProps>) = child(RadioComponent.Button, jsObject {}, handler)
