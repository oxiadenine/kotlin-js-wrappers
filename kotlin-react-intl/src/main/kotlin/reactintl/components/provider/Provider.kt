@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.provider

import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.State
import reactintl.IntlCache
import reactintl.IntlConfig
import reactintl.IntlShape

@JsName("IntlProvider")
external val IntlProvider: FC<ProviderProps>

external interface ProviderProps : IntlConfig, PropsWithChildren

external interface ProviderState : State {
    var cache: IntlCache
    var intl: IntlShape?
    var prevConfig: IntlConfig
}

external val createIntl: CreateIntlFn<ReactNode, IntlConfig, IntlShape>
