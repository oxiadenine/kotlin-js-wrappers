package antd.input

import kotlinext.js.*
import react.*

fun RBuilder.input(handler: RHandler<InputProps>) = child(InputComponent::class, handler)
fun RBuilder.inputGroup(handler: RHandler<InputGroupProps>) = child(InputComponent.Group, jsObject {}, handler)
fun RBuilder.search(handler: RHandler<SearchProps>) = child(InputComponent.Search, jsObject {}, handler)
fun RBuilder.textArea(handler: RHandler<TextAreaProps>) = child(InputComponent.TextArea, jsObject {}, handler)
fun RBuilder.password(handler: RHandler<PasswordProps>) = child(InputComponent.Password, jsObject {}, handler)
