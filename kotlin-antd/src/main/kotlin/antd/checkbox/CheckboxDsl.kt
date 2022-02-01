package antd.checkbox

import kotlinext.js.*
import react.*

fun RBuilder.checkbox(handler: RHandler<CheckboxProps>) = child(CheckboxComponent::class, handler)
fun RBuilder.checkboxGroup(handler: RHandler<CheckboxGroupProps>) = child(CheckboxComponent.Group, jso {}, handler)
