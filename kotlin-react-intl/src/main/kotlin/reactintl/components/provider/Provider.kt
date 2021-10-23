@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.provider

import react.*
import reactintl.*

@JsName("IntlProvider")
external class ProviderComponent : Component<ProviderProps, ProviderState> {
    override fun render(): ReactElement?
}

external interface ProviderProps : IntlConfig, PropsWithChildren

external interface ProviderState : State {
    var cache: IntlCache
    var intl: IntlShape?
    var prevConfig: IntlConfig
}

external val createIntl: CreateIntlFn<ReactNode, IntlConfig, IntlShape>
