@file:JsModule("react-intl")

package reactintl.provider

import react.*
import reactintl.IntlCache
import reactintl.IntlShape

@JsName("IntlProvider")
external class IntlProviderComponent : Component<IntlProviderProps, IntlProviderState> {
    override fun render(): ReactElement?
}

external interface IntlProviderProps : OptionalIntlConfig, RProps

external interface IntlProviderState : RState {
    var cache: IntlCache
    var intl: IntlShape?
    var prevConfig: OptionalIntlConfig
}

@JsName("createIntl")
external fun createIntl(config: OptionalIntlConfig, cache: IntlCache? = definedExternally): RProviderProps<IntlShape>
