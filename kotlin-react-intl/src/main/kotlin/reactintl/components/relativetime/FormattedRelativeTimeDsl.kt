package reactintl.components.relativetime

import react.*

fun RBuilder.formattedRelativeTime(handler: RHandler<FormattedRelativeTimeProps>) =
    child(FormattedRelativeTimeComponent::class, handler)
