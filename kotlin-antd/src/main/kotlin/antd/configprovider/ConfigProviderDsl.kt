package antd.configprovider

import react.*

fun RBuilder.configProvider(handler: RHandler<ConfigProviderProps>) = child(ConfigProviderComponent::class, handler)
