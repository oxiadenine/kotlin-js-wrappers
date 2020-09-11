@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.datetime

external interface IntlDateTimeFormatOptions {
    var localeMatcher: String?
        get() = definedExternally
        set(value) = definedExternally
    var weekday: String?
        get() = definedExternally
        set(value) = definedExternally
    var era: String?
        get() = definedExternally
        set(value) = definedExternally
    var year: String?
        get() = definedExternally
        set(value) = definedExternally
    var month: String?
        get() = definedExternally
        set(value) = definedExternally
    var day: String?
        get() = definedExternally
        set(value) = definedExternally
    var hour: String?
        get() = definedExternally
        set(value) = definedExternally
    var minute: String?
        get() = definedExternally
        set(value) = definedExternally
    var second: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeZoneName: String?
        get() = definedExternally
        set(value) = definedExternally
    var formatMatcher: String?
        get() = definedExternally
        set(value) = definedExternally
    var hour12: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeZone: String?
        get() = definedExternally
        set(value) = definedExternally
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
        get() = definedExternally
        set(value) = definedExternally
    var weekday: String?
        get() = definedExternally
        set(value) = definedExternally
    var era: String?
        get() = definedExternally
        set(value) = definedExternally
    var year: String?
        get() = definedExternally
        set(value) = definedExternally
    var month: String?
        get() = definedExternally
        set(value) = definedExternally
    var day: String?
        get() = definedExternally
        set(value) = definedExternally
    var hour: String?
        get() = definedExternally
        set(value) = definedExternally
    var minute: String?
        get() = definedExternally
        set(value) = definedExternally
    var second: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeZoneName: String?
        get() = definedExternally
        set(value) = definedExternally
}
