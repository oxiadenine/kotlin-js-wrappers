package reactintl.time

import react.RBuilder
import react.RHandler

fun RBuilder.formattedTime(handler: RHandler<FormattedTimeProps>) = child(FormattedTimeComponent::class, handler)
