package reactintl.number

import react.RBuilder
import react.RHandler

fun RBuilder.formattedNumber(handler: RHandler<FormattedNumberProps>) = child(FormattedNumberComponent::class, handler)
