package reactintl.relative

import react.*

fun RBuilder.formattedRelative(handler: RHandler<FormattedRelativeTimeProps>) = child(FormattedRelativeTimeComponent::class, handler)
