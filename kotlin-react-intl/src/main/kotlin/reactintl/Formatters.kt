@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

import reactintl.datetime.DateTimeFormatOptions
import reactintl.datetime.IntlDateTimeFormat
import reactintl.datetime.IntlDateTimeFormatOptions
import reactintl.datetime.IntlDateTimeFormatPart
import reactintl.displayname.IntlDisplayNameFormatOptions
import reactintl.displayname.IntlDisplayNames
import reactintl.list.IntlListFormat
import reactintl.list.IntlListFormatOptions
import reactintl.message.MessageDescriptor
import reactintl.message.MessageFormat
import reactintl.number.IntlNumberFormat
import reactintl.number.IntlNumberFormatOptions
import reactintl.number.IntlNumberFormatPart
import reactintl.number.NumberFormatOptions
import reactintl.plural.IntlPluralFormatOptions
import reactintl.plural.IntlPluralRules
import reactintl.relative.IntlRelativeTimeFormat

external interface Formats {
    var number: Any
    var date: Any
    var time: Any
}

external interface FormatterCache {
    var number: Any
    var dateTime: Any
    var pluralRules: Any
}

external interface Formatters {
    fun getDateTimeFormat(vararg args: Any): IntlDateTimeFormat
    fun getNumberFormat(vararg args: Any): IntlNumberFormat
    fun getMessageFormat(vararg args: Any): MessageFormat
    fun getRelativeTimeFormat(vararg args: Any): IntlRelativeTimeFormat
    fun getPluralRules(vararg args: Any): IntlPluralRules
    fun getListFormat(vararg args: Any): IntlListFormat
    fun getDisplayNames(vararg args: Any): IntlDisplayNames
}

external interface IntlFormatters {
    fun formatDate(
        value: Any? = definedExternally,
        opts: DateTimeFormatOptions? = definedExternally): String
    fun formatTime(
        value: Any? = definedExternally,
        opts: DateTimeFormatOptions? = definedExternally): String
    fun formatDateToParts(
        value: Any? = definedExternally,
        opts: DateTimeFormatOptions? = definedExternally): Array<IntlDateTimeFormatPart>
    fun formatTimeToParts(
        value: Any? = definedExternally,
        opts: DateTimeFormatOptions? = definedExternally): Array<IntlDateTimeFormatPart>
    fun formatRelativeTime(
        value: Any? = definedExternally,
        unit: Any? = definedExternally,
        opts: DateTimeFormatOptions? = definedExternally): String
    fun formatNumber(
        value: Any? = definedExternally,
        opts: NumberFormatOptions? = definedExternally): String
    fun formatNumberToParts(
        value: Any? = definedExternally,
        opts: NumberFormatOptions? = definedExternally): Array<IntlNumberFormatPart>
    fun formatPlural(
        value: Any? = definedExternally,
        opts: IntlPluralFormatOptions? = definedExternally): Any?
    fun formatMessage(descriptor: MessageDescriptor, values: Any? = definedExternally): String
    fun formatList(values: Array<Any>, opts: IntlListFormatOptions): Any
    fun formatDisplayName(value: Any, opts: IntlDisplayNameFormatOptions): String?
}

external enum class PartType {
    LITERAL,
    OBJECT
}

external interface LiteralPart {
    var type: PartType
    var value: String
}

external interface ObjectPart<T> {
    var type: PartType
    var value: T
}

external fun <T> isFormatXMLElementFn(el: Any /* T | FormatXMLElementFn<T> */): Boolean
external fun <T> formatToParts(
    els: Array<MessageFormatElement>,
    locales: Any /* String | Array<String> */,
    formatters: IntlFormatters,
    formats: Formats,
    values: Any,
    currentPluralValue: Number? = definedExternally,
    originalMessage: String? = definedExternally): Array<MessageFormatPart<T>>
