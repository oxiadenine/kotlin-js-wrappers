package antd.autocomplete

import react.*

fun RBuilder.autoComplete(handler: RHandler<AutoCompleteProps>) = child(AutoCompleteComponent::class, handler)
