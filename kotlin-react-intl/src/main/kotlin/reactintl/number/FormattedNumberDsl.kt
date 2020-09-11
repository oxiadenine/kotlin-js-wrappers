package reactintl.number

import react.RBuilder
import react.RHandler

fun RBuilder.formattedNumber(handler: RHandler<FormattedNumberProps>) = child(FormattedNumberComponent::class, handler)
fun RBuilder.formattedNumberParts(handler: RHandler<FormattedNumberPartsProps>) = child(FormattedNumberPartsComponent::class, handler)
