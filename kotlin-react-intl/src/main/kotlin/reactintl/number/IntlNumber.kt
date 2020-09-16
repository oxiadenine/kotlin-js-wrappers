@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.number

external interface IntlNumberFormatOptions {
    var style: String?
    var currency: String?
    var currencyDisplay: String?
    var useGrouping: Boolean?
    var minimumIntegerDigits: Number?
    var minimumFractionDigits: Number?
    var maximumFractionDigits: Number?
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
}

external interface IntlNumberFormat {
    fun format(value: Number): String
    fun resolvedOptions(): ResolvedNumberFormatOptions
}

external interface IntlNumberFormatPart {
    var type: NumberFormatPartTypes
    var value: String
}

external interface ResolvedNumberFormatOptions {
    var locale: String
    var numberingSystem: String
    var style: String
    var currency: String?
    var currencyDisplay: String?
    var minimumIntegerDigits: Number
    var minimumFractionDigits: Number
    var maximumFractionDigits: Number
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
    var useGrouping: Boolean
}
