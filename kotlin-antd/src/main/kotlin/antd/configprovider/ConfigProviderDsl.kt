package antd.configprovider

import react.RBuilder
import react.RHandler

fun RBuilder.configProvider(handler: RHandler<ConfigProviderProps>) = child(ConfigProviderComponent::class, handler)
