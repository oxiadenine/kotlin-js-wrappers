package reactintl.plural

import react.*
import reactintl.*

fun RBuilder.formattedPlural(handler: RHandler<WithIntlProps<FormattedPluralProps>>) = child(FormattedPluralComponent::class, handler)
