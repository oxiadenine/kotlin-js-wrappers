@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

import react.*

@JsName("defineMessages")
external fun <K, T, U> defineMessages(msgs: U): U

@JsName("defineMessage")
external fun <T> defineMessage(msg: T): T

@JsName("RawIntlProvider")
external val rawIntlProvider: Provider<IntlShape>

@JsName("IntlContext")
external val intlContext: Context<IntlShape>

@JsName("injectIntl")
external fun <IntlPropName, P : WrappedComponentProps<IntlPropName>> injectIntl(
    wrappedComponent: Any /* JsClass<Component<P, State>> */,
    options: Opts<IntlPropName, Boolean>? = definedExternally
): ComponentType<WithIntlProps<P>>

@JsName("useIntl")
external fun useIntl(): IntlShape

@JsName("createIntlCache")
external fun createIntlCache(): IntlCache

@JsName("createIntl")
external fun createIntl(config: OptionalIntlConfig, cache: IntlCache? = definedExternally): IntlShape

external interface Opts<IntlPropName, ForwardRef> {
    var intlPropName: IntlPropName?
    var forwardRef: ForwardRef?
    var enforceContext: Boolean?
}

external interface WrappedComponentProps<IntlPropName> : RProps

external interface WithIntlProps<P> : RProps {
    var forwardedRef: MutableRefObject<Any>?
}

external interface IntlShape : IntlConfig, IntlFormatters {
    var formatters: Formatters
}

external interface IntlCache {
    var dateTime: Any
    var number: Any
    var message: Any
    var relativeTime: Any
    var pluralRules: Any
}

external interface IntlConfig : CoreIntlConfig<ReactElement> {
    var textComponent: Any?
    var wrapRichTextChunksInFragment: Boolean?
}

external interface CoreIntlConfig<T> {
    var locale: String
    var timeZone: String?
    var formats: CustomFormats
    var messages: Any
    var defaultLocale: String
    var defaultFormats: CustomFormats
    var defaultRichTextElements: Any?
    var onError: (error: IntlError) -> Unit
}

external interface CustomFormats {
    var relative: Any
}

external interface CustomFormatConfig {
    var format: String?
}

external interface Location {
    var start: LocationDetails
    var end: LocationDetails
}

external interface LocationDetails {
    var offset: Number
    var line: Number
    var column: Number
}

external interface LocaleData<T> {
    var data: Any
    var availableLocales: Array<String>
}

external interface LocaleFieldsData {
    var nu: Array<String>?
}
