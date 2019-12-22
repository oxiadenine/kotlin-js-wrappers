package antd.select

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

inline fun <T : SelectValue, reified SC : SelectComponent<T>> RBuilder.select(noinline handler: RHandler<SelectProps<T>>) = child(SC::class, handler)
fun RBuilder.option(handler: RHandler<OptionProps>) = child(SelectComponent.Option, jsObject {}, handler)
fun RBuilder.optGroup(handler: RHandler<OptionGroupProps>) = child(SelectComponent.OptGroup, jsObject {}, handler)
