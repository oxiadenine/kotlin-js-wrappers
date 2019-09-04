package antd.autocomplete

import react.RBuilder
import react.RHandler

fun RBuilder.autoComplete(handler: RHandler<AutoCompleteProps>) = child(AutoCompleteComponent::class, handler)
