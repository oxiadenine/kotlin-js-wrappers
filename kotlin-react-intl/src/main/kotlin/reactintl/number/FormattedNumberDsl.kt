package reactintl.number

import react.*

fun RBuilder.formattedNumber(handler: RHandler<FormattedNumberProps>) = child(FormattedNumberComponent::class, handler)
fun RBuilder.formattedNumberParts(handler: RHandler<FormattedNumberPartsProps>) = child(FormattedNumberPartsComponent::class, handler)
