@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.provider

import react.*
import reactintl.*

@JsName("IntlProvider")
external class IntlProviderComponent : Component<IntlProviderProps, IntlProviderState> {
    override fun render(): ReactElement?
}

external interface IntlProviderProps : OptionalIntlConfig, RProps

external interface IntlProviderState : State {
    var cache: IntlCache
    var intl: IntlShape?
    var prevConfig: OptionalIntlConfig
}
