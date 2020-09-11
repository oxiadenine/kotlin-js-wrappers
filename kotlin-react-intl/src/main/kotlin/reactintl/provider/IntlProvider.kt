@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.provider

import react.*
import reactintl.IntlCache
import reactintl.IntlShape
import reactintl.OptionalIntlConfig

@JsName("IntlProvider")
external class IntlProviderComponent : Component<IntlProviderProps, IntlProviderState> {
    override fun render(): ReactElement?
}

external interface IntlProviderProps : OptionalIntlConfig, RProps

external interface IntlProviderState : RState {
    var cache: IntlCache
    var intl: IntlShape?
        get() = definedExternally
        set(value) = definedExternally
    var prevConfig: OptionalIntlConfig
}
