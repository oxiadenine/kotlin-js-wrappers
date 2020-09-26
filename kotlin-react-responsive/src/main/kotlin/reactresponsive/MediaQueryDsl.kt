package reactresponsive

import react.*

fun RBuilder.mediaQuery(handler: RHandler<MediaQueryProps>) = child(MediaQueryComponent::class, handler)
