package antd.input

import kotlinext.js.*
import react.*

fun RBuilder.input(handler: RHandler<InputProps>) = child(InputComponent::class, handler)
fun RBuilder.inputGroup(handler: RHandler<GroupProps>) = child(InputComponent.Group, jso {}, handler)
fun RBuilder.search(handler: RHandler<SearchProps>) = child(InputComponent.Search, jso {}, handler)
fun RBuilder.textArea(handler: RHandler<TextAreaProps>) = child(InputComponent.TextArea, jso {}, handler)
fun RBuilder.password(handler: RHandler<PasswordProps>) = child(InputComponent.Password, jso {}, handler)
