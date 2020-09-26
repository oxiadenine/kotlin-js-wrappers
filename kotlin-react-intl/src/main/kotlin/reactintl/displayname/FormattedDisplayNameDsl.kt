package reactintl.displayname

import react.*

fun RBuilder.formattedDisplayName(handler: RHandler<FormattedDisplayNameProps>) = child(FormattedDisplayNameComponent::class, handler)
