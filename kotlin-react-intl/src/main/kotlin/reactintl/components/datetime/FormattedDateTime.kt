@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.datetime

import kotlinext.js.Record
import react.*
import reactintl.*

@JsName("FormattedDate")
external class FormattedDateComponent : Component<FormattedDateProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedDateParts")
external class FormattedDatePartsComponent : Component<FormattedDatePartsProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedTime")
external class FormattedTimeComponent : Component<FormattedTimeProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedTimeParts")
external class FormattedTimePartsComponent : Component<FormattedTimePartsProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedMessage")
open external class FormattedDateTimeRangeComponent : Component<FormattedDateTimeRangeProps, State> {
    override fun render(): ReactElement?
}

external interface FormattedDateProps : IntlDateTime.DateTimeFormatOptions, CustomFormatConfig, Props {
    var value: Any? /* String | Number | Date */
}

external interface FormattedTimeProps : IntlDateTime.DateTimeFormatOptions, CustomFormatConfig, Props {
    var value: Any? /* String | Number | Date */
}

external interface FormattedDatePartsProps : FormatDateOptions, Props {
    var value: Any? /* Date | Number | String */
    fun children(`val`: Array<IntlDateTime.DateTimeFormatPart>): ReactElement?
}

external interface FormattedTimePartsProps : FormatDateOptions, Props {
    var value: Any /* Date | Number | String */
    fun children(`val`: Array<IntlDateTime.DateTimeFormatPart>): ReactElement?
}

external interface FormattedDateTimeRangeProps : FormatDateOptions, Props {
    var from: Any /* Number | Date */
    var to: Any /* Number | Date */
    fun children(value: ReactNode): ReactElement?
}

external interface Formats : IntlDateTime.DateTimeFormatOptions {
    override var hour12: Boolean?
    var pattern: String
    var pattern12: String
    var skeleton: String
    var rawPattern: String
    var rangePatterns: Record<Any /* TABLE_2 | "default" */, RangePatterns>
    var rangePatterns12: Record<Any /* TABLE_2 | "default" */, RangePatterns>
}

external interface IntlDateTimeFormatInternal {
    var locale: String
    var dataLocale: String
    var calendar: String?
    var dateStyle: String? /* "full" | "long" | "medium" | "short" */
    var timeStyle: String? /* "full" | "long" | "medium" | "short" */
    var weekday: String /* "narrow" | "short" | "long" */
    var era: String /* "narrow" | "short" | "long" */
    var year: String /* "2-digit" | "numeric" */
    var month: String /* "2-digit" | "numeric" | "narrow" | "short" | "long" */
    var day: String /* "2-digit" | "numeric" */
    var dayPeriod: String /* "narrow" | "short" | "long" */
    var hour: String /* "2-digit" | "numeric" */
    var minute: String /* "2-digit" | "numeric" */
    var second: String /* "2-digit" | "numeric" */
    var timeZoneName: String /* "short" | "long" */
    var fractionalSecondDigits: Number? /* 1 | 2 | 3 */
    var hourCycle: String
    var numberingSystem: String
    var timeZone: String
    var pattern: String
    var format: Formats
    var rangePatterns: Record<Any /* TABLE_2 | "default" */, RangePatterns>
    var boundFormat: ((date: Any? /* Date | number */) -> String)?
}

external interface RangePatternPart<T : RangePatternType> {
    var source: T
    var pattern: String
}

external interface RangePatterns : IntlDateTime.DateTimeFormatOptions {
    override var hour12: Boolean?
    var patternParts: Array<RangePatternPart<RangePatternType>>
}

external enum class RangePatternType { START_RANGE, SHARED, END_RANGE }

external interface TimeZoneNameData {
    var long: Array<String>?
    var short: Array<String>?
}

external interface EraData {
    var BC: String
    var AD: String
}

external interface DateTimeFormatLocaleInternalData {
    var am: String
    var pm: String
    var weekday: DateTimeFormatLocaleInternalDataWeekDay
    var era: DateTimeFormatLocaleInternalDataEra
    var month: DateTimeFormatLocaleInternalDataMonth
    var timeZoneName: TimeZoneName
    var gmtFormat: String
    var hourFormat: String
    var hourCycle: String
    var dateFormat: DateTimeFormatLocaleInternalDataDateFormat
    var timeFormat: DateTimeFormatLocaleInternalDataTimeFormat
    var dateTimeFormat: DateTimeFormatLocaleInternalDataDateTimeFormat
    var formats: Record<String, Array<Formats>>
    var nu: Array<String>
    var hc: Array<String>
    var ca: Array<String>
}

external interface DateTimeFormatLocaleInternalDataWeekDay {
    var narrow: Array<String>
    var long: Array<String>
    var short: Array<String>
}

external interface DateTimeFormatLocaleInternalDataEra {
    var narrow: EraData
    var long: EraData
    var short: EraData
}

external interface DateTimeFormatLocaleInternalDataMonth {
    var narrow: Array<String>
    var long: Array<String>
    var short: Array<String>
}

external interface DateTimeFormatLocaleInternalDataTimeFormat {
    var full: Formats
    var long: Formats
    var medium: Formats
    var short: Formats
}

external interface DateTimeFormatLocaleInternalDataDateFormat {
    var full: Formats
    var long: Formats
    var medium: Formats
    var short: Formats
}

external interface DateTimeFormatLocaleInternalDataDateTimeFormat {
    var full: String
    var long: String
    var medium: String
    var short: String
}

external interface IntervalFormatsData {
    var intervalFormatFallback: String
}

external interface DateTimeFormat : IntlDateTime.DateTimeFormat {
    override fun resolvedOptions(): ResolvedDateTimeFormatOptions
    fun formatRange(startDate: Any /* Number | Date */, endDate: Any /* Number | Date */): String
    fun formatRangeToParts(
        startDate: Any /* Number | Date */,
        endDate: Any /* Number | Date */
    ): Array<IntlDateTime.DateTimeFormatPart>
}

external interface ResolvedDateTimeFormatOptions : IntlDateTime.ResolvedDateTimeFormatOptions {
    var dateStyle: String? /* "full" | "long" | "medium" | "short" */
    var timeStyle: String? /* "full" | "long" | "medium" | "short" */
    var hourCycle: String
    override var numberingSystem: String
}

external interface DateTimeFormatPart {
    var type: DateTimeFormatPartType
    var value: String?
    var source: RangePatternType?
}

external object IntlDateTime {
    interface DateTimeFormatOptions {
        var localeMatcher: String? /* "best fit" | "lookup" */
        var weekday: String? /* "long" | "short" | "narrow" */
        var era: String? /* "long" | "short" | "narrow" */
        var year: String? /* "numeric" | "2-digit" */
        var month: String? /* "numeric" | "2-digit" | "long" | "short" | "narrow" */
        var day: String? /* "numeric" | "2-digit" */
        var hour: String? /* "numeric" | "2-digit" */
        var minute: String? /* "numeric" | "2-digit" */
        var second: String? /* "numeric" | "2-digit" */
        var timeZoneName: String? /* "long" | "short" */
        var formatMatcher: String? /* "best fit" | "basic" */
        var hour12: Boolean?
        var timeZone: String?
    }

    interface DateTimeFormat {
        fun format(date: Any? /* Date | number */): String
        fun resolvedOptions(): ResolvedDateTimeFormatOptions
    }

    interface DateTimeFormatPart {
        var type: IntlDateTimeFormatPartTypes
        var value: String
    }

    interface ResolvedDateTimeFormatOptions {
        var locale: String
        var calendar: String
        var numberingSystem: String
        var timeZone: String
        var hour12: Boolean?
        var weekday: String?
        var era: String?
        var year: String?
        var month: String?
        var day: String?
        var hour: String?
        var minute: String?
        var second: String?
        var timeZoneName: String?
    }
}
