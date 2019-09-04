package reactintl.message

import react.RBuilder
import react.RHandler

fun RBuilder.formattedMessage(handler: RHandler<FormattedMessageProps<Any>>) = child(FormattedMessageComponent::class, handler)
fun RBuilder.formattedHTMLMessage(handler: RHandler<FormattedMessageProps<Any>>) = child(FormattedHTMLMessageComponent::class, handler)
