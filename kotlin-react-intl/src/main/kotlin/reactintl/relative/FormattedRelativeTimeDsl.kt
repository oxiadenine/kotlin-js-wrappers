package reactintl.relative

import react.RBuilder
import react.RHandler

fun RBuilder.formattedRelative(handler: RHandler<FormattedRelativeTimeProps>) = child(FormattedRelativeTimeComponent::class, handler)
