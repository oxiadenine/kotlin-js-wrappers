package antd.checkbox

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.checkbox(handler: RHandler<CheckboxProps>) = child(CheckboxComponent::class, handler)
fun RBuilder.checkboxGroup(handler: RHandler<CheckboxGroupProps>) = child(CheckboxComponent.Group, jsObject {}, handler)
