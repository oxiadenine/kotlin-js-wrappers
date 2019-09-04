package antd.localeprovider

import react.RBuilder
import react.RHandler

fun RBuilder.localeProvider(handler: RHandler<LocaleProviderProps>) = child(LocaleProviderComponent::class, handler)
