package antd.select

import kotlinext.js.*
import react.*

inline fun <T : SelectValue, reified SC : SelectComponent<T>> RBuilder.select(noinline handler: RHandler<SelectProps<T>>) = child(SC::class, handler)
fun RBuilder.option(handler: RHandler<OptionProps>) = child(SelectComponent.Option, jso {}, handler)
fun RBuilder.optGroup(handler: RHandler<OptionGroupProps>) = child(SelectComponent.OptGroup, jso {}, handler)
