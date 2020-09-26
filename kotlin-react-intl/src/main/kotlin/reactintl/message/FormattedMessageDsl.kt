package reactintl.message

import react.*

fun RBuilder.formattedMessage(handler: RHandler<FormattedMessageProps<Any>>) = child(FormattedMessageComponent::class, handler)
