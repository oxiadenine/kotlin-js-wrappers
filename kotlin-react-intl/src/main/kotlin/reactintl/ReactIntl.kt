@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

import kotlinext.js.Record
import react.*
import reactintl.components.datetime.DateTimeFormat
import reactintl.components.displayname.DisplayNames
import reactintl.components.list.ListFormat
import reactintl.components.message.MessageFormat
import reactintl.components.number.IntlNumber
import reactintl.components.plural.IntlPlural
import reactintl.components.relativetime.IntlRelativeTime

@JsName("defineMessages")
external fun <K, T : MessageDescriptor, U> defineMessages(msgs: U): U

@JsName("defineMessage")
external fun <T : MessageDescriptor> defineMessage(msg: T): T

external interface IntlShape : ResolvedIntlConfig, IntlFormatters<ReactNode> {
    var formatters: Formatters
}

external interface IntlCache {
    var dateTime: Record<String, DateTimeFormat>
    var number: Record<String, IntlNumber.NumberFormat>
    var message: Record<String, MessageFormat>
    var relativeTime: Record<String, IntlRelativeTime.RelativeTimeFormat>
    var pluralRules: Record<String, IntlPlural.PluralRules>
    var list: Record<String, ListFormat>
    var displayNames: Record<String, DisplayNames>
}

external interface ResolvedIntlConfig : CoreResolvedIntlConfig<ReactNode> {
    var textComponent: ComponentType<Props>
    var wrapRichTextChunksInFragment: Boolean?
}

external interface CoreResolvedIntlConfig<T> {
    var locale: String
    var timeZone: String?
    var formats: CustomFormats
    var messages: Any /* Record<String, String> | Record<String, Array<MessageFormatElement>> */
    var defaultLocale: String
    var defaultFormats: CustomFormats
    var defaultRichTextElements: Record<String, FormatXMLElementFn<T, T>>?
    var onError: OnErrorFn
}

external interface MessageDescriptor {
    var id: Any? /* String | Number */
    var description: Any? /* String | object */
    var defaultMessage: Any? /* String | Array<MessageFormatElement> */
}

external interface IntlConfig : ResolvedIntlConfig

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
    var data: T
    var locale: Locale
}

external interface LocaleFieldsData {
    var nu: Array<String>?
}
