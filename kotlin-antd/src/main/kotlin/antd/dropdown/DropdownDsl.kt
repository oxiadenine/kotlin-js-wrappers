package antd.dropdown

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.dropdown(handler: RHandler<DropdownProps>) = child(DropdownComponent::class, handler)
fun RBuilder.dropdownButton(handler: RHandler<DropdownButtonProps>) = child(DropdownComponent.Button, jsObject {}, handler)
