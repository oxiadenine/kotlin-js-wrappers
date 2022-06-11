@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components

import react.*
import reactintl.IntlShape

@JsName("injectIntl")
external fun <IntlPropName, P : WrappedComponentProps<Any>> injectIntl(
    wrappedComponent: ComponentType<P>,
    options: Opts<IntlPropName, Boolean>? = definedExternally
): InjectIntlComponent<P>

external interface InjectIntlComponent<P : WrappedComponentProps<Any>> : FC<WithIntlProps<P>> {
    val WrappedComponent: ComponentType<P>
}

@JsName("RawIntlProvider")
external val RawIntlProvider: Provider<IntlShape>

@JsName("IntlContext")
external val IntlContext: Context<IntlShape>

external interface Opts<IntlPropName, ForwardRef> {
    var intlPropName: IntlPropName?
    var forwardRef: ForwardRef?
    var enforceContext: Boolean?
}

external interface WrappedComponentProps<IntlPropName> : Props

external interface WithIntlProps<P> : Props {
    var forwardedRef: Ref<Any>?
}