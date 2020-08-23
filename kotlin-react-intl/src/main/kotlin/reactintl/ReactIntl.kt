@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

import react.*

@JsName("defineMessages")
external fun <Names /* keyof any */> defineMessages(messageDescriptors: Messages<Names>): Messages<Names>

external interface Messages<Names /* keyof any = string */> {
    /* [key in Names]: FormattedMessage.MessageDescriptor */
}

@JsName("RawIntlProvider")
external val rawIntlProvider: RProvider<RProviderProps<IntlShape>>

@JsName("IntlContext")
external val intlContext: RContext<IntlShape>

@JsName("injectIntl")
external fun <IntlPropName, P : WrappedComponentProps<IntlPropName /* IntlPropName = WrappedComponentProps<any> */>> injectIntl(wrappedComponent: JsClass<Component<P, RState>> /* React.ComponentType<P> */, options: Opts<IntlPropName>? = definedExternally): JsClass<Component<WithIntlProps<P>, RState>>? = definedExternally /* React.ComponentType<WithIntlProps<P> & {
    WrappedComponent: typeof WrappedComponent
} */

external interface Opts<IntlPropName /* IntlPropName extends String = 'intl' */> {
    var intlPropName: IntlPropName?
    var forwardRef: Boolean?
    var enforceContext: Boolean?
}

external interface WrappedComponentProps<IntlPropName /* IntlPropName extends string = 'intl' */> : RProps {
    /* [k in IntlPropName]: IntlShape */
}

external interface WithIntlProps<P> /* P = Omit<P, keyof WrappedComponentProps> & */ : RProps {
    var forwardedRef: RMutableRef<Any>?
}

@JsName("useIntl")
external fun useIntl(): IntlShape

external interface IntlShape : IntlConfig, IntlFormatters {
    var formatters: Formatters
}

@JsName("createIntlCache")
external fun createIntlCache(): IntlCache

external interface IntlCache {
    var dateTime: Any /* Record<string, Intl.DateTimeFormat> */
    var number: Any /* Record<string, Intl.NumberFormat> */
    var message: Any /* Record<string, IntlMessageFormat> */
    var relativeTime: Any /* Record<string, IntlRelativeTimeFormat> */
    var pluralRules: Any /* Record<string, Intl.PluralRules> */
}

external interface IntlConfig {
    var locale: String
    var timeZone: String?
    var formats: CustomFormats
    var textComponent: dynamic /* React.ComponentType | keyof React.ReactHTML */
    var messages: dynamic /* Record<string, string> | Record<string, MessageFormatElement[]> */
    var defaultLocale: String
    var defaultFormats: CustomFormats
    var onError: (error: String) -> Unit
}

external interface CustomFormats {
    var relative: dynamic /* Record<string, IntlRelativeTimeFormatOptions> */
}

external interface CustomFormatConfig {
    var format: String?
}

external interface IntlFormatters {
    var formatDate: (value: Any? /* Parameters<Intl.DateTimeFormat['format']>[0] | string */, opts: FormatDateOptions?) -> String
    var formatTime: (value: Any? /* Parameters<Intl.DateTimeFormat['format']>[0] | string */, opts: FormatDateOptions?) -> String
    var formatRelativeTime: (value: Any? /* Parameters<IntlRelativeTimeFormat['format']>[0] */, unit: Any? /* Parameters<IntlRelativeTimeFormat['format']>[0] */, opts: FormatRelativeTimeOptions?) -> String
    var formatNumber: (value: Any? /* Parameters<Intl.NumberFormat['format']>[0] */, opts: FormatNumberOptions?) -> String
    var formatPlural: (value: Any? /* Parameters<Intl.PluralRules['select']>[0] */, opts: FormatPluralOptions?) -> Any? /* ReturnType<Intl.PluralRules['select']> */
    var formatMessage: (descriptor: MessageDescriptor, values: Any? /* Record<string, PrimitiveType | React.ReactElement | FormatXMLElementFn> */) -> Any /* string | React.ReactNodeArray */
    var formatHTMLMessage: (descriptor: MessageDescriptor, values: Any? /* Record<string, PrimitiveType> */) -> String
}

external interface Formatters {
    fun getDateTimeFormat(vararg args: Any/* ConstructorParameters<typeof Intl.DateTimeFormat> */): Any /* Intl.DateTimeFormat */
    fun getNumberFormat(vararg args: Any /* ConstructorParameters<typeof Intl.NumberFormat> */): Any /* Intl.NumberFormat */
    fun getMessageFormat(vararg args: Any /* ConstructorParameters<typeof IntlMessageFormat> */): Any /* IntlMessageFormat */
    fun getRelativeTimeFormat(vararg args: Any /* ConstructorParameters<typeof IntlRelativeTimeFormat> */): Any /* IntlRelativeTimeFormat */
    fun getPluralRules(vararg args: Any /* ConstructorParameters<typeof Intl.PluralRules> */): Any /* Intl.PluralRules */
}

external interface MessageDescriptor {
    var id: String
    var description: Any? /* String | object */
    var defaultMessage: String?
}

@JsName("addLocaleData")
external fun addLocaleData(data: Any /* Array<Locale> | Locale */)

external interface Locale {
    var locale: String
    var fields: Any? /* { [key: String]: String } */
    fun pluralRuleFunction(n: Number, ord: Boolean): String
}
