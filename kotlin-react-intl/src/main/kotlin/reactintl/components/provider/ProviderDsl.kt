package reactintl.components.provider

import react.*

fun RBuilder.intlProvider(handler: RHandler<ProviderProps>) = child(ProviderComponent::class, handler)
