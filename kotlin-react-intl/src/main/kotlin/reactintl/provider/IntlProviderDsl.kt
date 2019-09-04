package reactintl.provider

import react.RBuilder
import react.RHandler

fun RBuilder.intlProvider(handler: RHandler<IntlProviderProps>) = child(IntlProviderComponent::class, handler)
