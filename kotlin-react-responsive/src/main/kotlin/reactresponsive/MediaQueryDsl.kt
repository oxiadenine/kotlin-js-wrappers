package reactresponsive

import react.RBuilder
import react.RHandler

fun RBuilder.mediaQuery(handler: RHandler<MediaQueryProps>) = child(MediaQueryComponent::class, handler)
