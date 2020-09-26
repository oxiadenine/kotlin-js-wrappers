package reactintl.provider

import react.*

fun RBuilder.intlProvider(handler: RHandler<IntlProviderProps>) = child(IntlProviderComponent::class, handler)
