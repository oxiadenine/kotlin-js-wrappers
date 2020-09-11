package reactintl.plural

import react.RBuilder
import react.RHandler
import reactintl.WithIntlProps

fun RBuilder.formattedPlural(handler: RHandler<WithIntlProps<FormattedPluralProps>>) = child(FormattedPluralComponent::class, handler)
