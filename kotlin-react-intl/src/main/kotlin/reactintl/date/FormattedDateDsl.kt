package reactintl.date

import react.RBuilder
import react.RHandler

fun RBuilder.formattedDate(handler: RHandler<FormattedDateProps>) = child(FormattedDateComponent::class, handler)
