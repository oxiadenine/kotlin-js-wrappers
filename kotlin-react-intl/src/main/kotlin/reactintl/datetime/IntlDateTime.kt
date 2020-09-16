@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.datetime

external interface IntlDateTimeFormatOptions {
    var localeMatcher: String?
    var weekday: String?
    var era: String?
    var year: String?
    var month: String?
    var day: String?
    var hour: String?
    var minute: String?
    var second: String?
    var timeZoneName: String?
    var formatMatcher: String?
    var hour12: Boolean?
    var timeZone: String?
}

external interface IntlDateTimeFormat {
    fun format(date: Any /* Date | Number */): String
    fun resolvedOptions(): ResolvedDateTimeFormatOptions
}

external interface IntlDateTimeFormatPart {
    var type: DateTimeFormatPartTypes
    var value: String
}

external interface ResolvedDateTimeFormatOptions {
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
