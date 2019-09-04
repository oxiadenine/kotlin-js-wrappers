package antd.select

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.select(handler: RHandler<SelectProps<SelectValue>>) = child(SelectComponent::class, handler)
fun RBuilder.option(handler: RHandler<OptionProps>) = child(SelectComponent.Option, jsObject {}, handler)
fun RBuilder.optGroup(handler: RHandler<OptionGroupProps>) = child(SelectComponent.OptGroup, jsObject {}, handler)
