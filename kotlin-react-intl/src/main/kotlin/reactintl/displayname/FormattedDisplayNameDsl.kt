package reactintl.displayname

import react.RBuilder
import react.RHandler

fun RBuilder.formattedDisplayName(handler: RHandler<FormattedDisplayNameProps>) = child(FormattedDisplayNameComponent::class, handler)
