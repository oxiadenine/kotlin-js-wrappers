package reactintl.components.list

import react.*

fun RBuilder.formattedList(handler: RHandler<FormattedListProps>) = child(FormattedListComponent::class, handler)
