package reactintl.datetime

import react.*

fun RBuilder.formattedDate(handler: RHandler<FormattedDateProps>) = child(FormattedDateComponent::class, handler)
fun RBuilder.formattedDateParts(handler: RHandler<FormattedDatePartsProps>) = child(FormattedDatePartsComponent::class, handler)

fun RBuilder.formattedTime(handler: RHandler<FormattedTimeProps>) = child(FormattedTimeComponent::class, handler)
fun RBuilder.formattedTimeParts(handler: RHandler<FormattedTimePartsProps>) = child(FormattedTimePartsComponent::class, handler)
