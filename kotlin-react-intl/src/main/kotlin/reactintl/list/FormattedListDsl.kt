package reactintl.list

import react.RBuilder
import react.RHandler

fun RBuilder.formattedList(handler: RHandler<FormattedListProps>) = child(FormattedListComponent::class, handler)
