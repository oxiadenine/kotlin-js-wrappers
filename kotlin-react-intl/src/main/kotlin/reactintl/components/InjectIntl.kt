@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components

import react.*
import reactintl.IntlShape

@JsName("injectIntl")
external fun <IntlPropName, P : WrappedComponentProps<IntlPropName>> injectIntl(
    wrappedComponent: Any /* JsClass<Component<P, State>> */,
    options: Opts<IntlPropName, Boolean>? = definedExternally
): ComponentType<WithIntlProps<P>>

@JsName("RawIntlProvider")
external val rawIntlProvider: Provider<IntlShape>

@JsName("IntlContext")
external val intlContext: Context<IntlShape>

external interface Opts<IntlPropName, ForwardRef> {
    var intlPropName: IntlPropName?
    var forwardRef: ForwardRef?
    var enforceContext: Boolean?
}

external interface WrappedComponentProps<IntlPropName> : Props

external interface WithIntlProps<P> : Props {
    var forwardedRef: MutableRefObject<Any>?
}
