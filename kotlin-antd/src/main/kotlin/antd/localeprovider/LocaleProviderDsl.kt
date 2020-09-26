package antd.localeprovider

import react.*

fun RBuilder.localeProvider(handler: RHandler<LocaleProviderProps>) = child(LocaleProviderComponent::class, handler)
