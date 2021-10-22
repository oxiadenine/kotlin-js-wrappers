package reactintl.components.plural

import react.*

fun RBuilder.formattedPlural(handler: RHandler<FormattedPluralProps>) = child(FormattedPluralComponent::class, handler)
