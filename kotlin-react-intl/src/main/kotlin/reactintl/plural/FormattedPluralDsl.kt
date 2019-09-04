package reactintl.plural

import react.RBuilder
import react.RHandler

fun RBuilder.formattedPlural(handler: RHandler<FormattedPluralProps>) = child(FormattedPluralComponent::class, handler)
