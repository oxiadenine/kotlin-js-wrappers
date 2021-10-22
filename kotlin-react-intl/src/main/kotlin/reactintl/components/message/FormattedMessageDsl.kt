package reactintl.components.message

import kotlinext.js.Record
import react.*

fun RBuilder.formattedMessage(handler: RHandler<FormattedMessageProps<Record<String, Any /* String | ReactNode */>>>) =
    child(FormattedMessageComponent::class, handler)
