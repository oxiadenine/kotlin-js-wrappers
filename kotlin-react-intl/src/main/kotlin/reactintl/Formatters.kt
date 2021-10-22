@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

import kotlinext.js.ReadonlyArray
import kotlinext.js.Record
import reactintl.components.datetime.*
import reactintl.components.displayname.*
import reactintl.components.list.*
import reactintl.components.message.*
import reactintl.components.number.*
import reactintl.components.plural.*
import reactintl.components.relativetime.*

external interface CustomFormats : Formats {
    var relative: Record<String, IntlRelativeTime.RelativeTimeFormatOptions>?
}

external interface CustomFormatConfig {
    var format: String
}

external interface Formats {
    var number: Any
    var date: Any
    var time: Any
}

external interface Formatters {
    fun getDateTimeFormat(vararg args: Any): IntlDateTime.DateTimeFormat
    fun getNumberFormat(vararg args: Any): IntlNumber.NumberFormat
    fun getMessageFormat(vararg args: Any): MessageFormat
    fun getRelativeTimeFormat(vararg args: Any): IntlRelativeTime.RelativeTimeFormat
    fun getPluralRules(vararg args: Any): IntlPlural.PluralRules
    fun getListFormat(vararg args: Any): ListFormat
    fun getDisplayNames(vararg args: Any): DisplayNames
}

external interface FormatDateOptions : IntlDateTime.DateTimeFormatOptions, CustomFormatConfig
external interface FormatNumberOptions : NumberFormatOptions, CustomFormatConfig
external interface FormatRelativeTimeOptions : IntlRelativeTime.RelativeTimeFormatOptions, CustomFormatConfig
external interface FormatPluralOptions : IntlPlural.PluralRulesOptions, CustomFormatConfig
external interface FormatListOptions : ListFormatOptions
external interface FormatDisplayNameOptions : DisplayNamesOptions

external interface IntlFormatters<T> {
    fun formatDateTimeRange(
        from: Any /* Number | Date */,
        to: Any /* Number | Date */,
        opts: FormatDateOptions? = definedExternally
    ): String

    fun formatDate(value: Any /*Date | Number | String */, opts: FormatDateOptions? = definedExternally): String
    fun formatTime(value: Any /*Date | Number | String */, opts: FormatDateOptions? = definedExternally): String
    fun formatDateToParts(
        value: Any /*Date | Number | String */,
        opts: FormatDateOptions? = definedExternally
    ): Array<IntlDateTime.DateTimeFormatPart>

    fun formatTimeToParts(
        value: Any /*Date | Number | String */,
        opts: FormatDateOptions? = definedExternally
    ): Array<IntlDateTime.DateTimeFormatPart>

    fun formatRelativeTime(
        value: Number,
        unit: IntlRelativeTimeFormatUnit? = definedExternally,
        opts: FormatRelativeTimeOptions? = definedExternally
    ): String

    fun formatNumber(value: Number, opts: FormatNumberOptions? = definedExternally): String
    fun formatNumberToParts(
        value: Number,
        opts: FormatNumberOptions? = definedExternally
    ): Array<IntlNumber.NumberFormatPart>

    fun formatPlural(value: Number, opts: FormatPluralOptions? = definedExternally): Number
    fun formatMessage(
        descriptor: MessageDescriptor,
        values: Record<String, Any /* PrimitiveType | FormatXMLElementFn<String, String> */>? = definedExternally,
        opts: MessageFormatOptions? = definedExternally
    ): String

    fun formatMessage(
        descriptor: MessageDescriptor,
        values: Record<String, Any /* PrimitiveType | T | FormatXMLElementFn<T, T> */>,
        opts: MessageFormatOptions
    ): T

    fun formatList(values: ReadonlyArray<String>, opts: FormatListOptions? = definedExternally): String
    fun formatList(
        values: ReadonlyArray<Any /* String | T */>,
        opts: FormatListOptions? = definedExternally
    ): Any /* T | String | Array</* String | T */> */

    fun formatListToParts(
        values: ReadonlyArray<Any /* String | T */>,
        opts: FormatListOptions? = definedExternally
    ): Array<Part<Any>>

    fun formatDisplayName(
        value: Any /* String | Number | Record<String, Any> */,
        opts: FormatDisplayNameOptions? = definedExternally
    ): String?
}
