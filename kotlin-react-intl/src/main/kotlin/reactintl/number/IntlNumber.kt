@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.number

external interface IntlNumberFormatOptions {
    var style: String?
        get() = definedExternally
        set(value) = definedExternally
    var currency: String?
        get() = definedExternally
        set(value) = definedExternally
    var currencyDisplay: String?
        get() = definedExternally
        set(value) = definedExternally
    var useGrouping: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimumIntegerDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minimumFractionDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maximumFractionDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minimumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maximumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
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
        get() = definedExternally
        set(value) = definedExternally
    var currencyDisplay: String?
        get() = definedExternally
        set(value) = definedExternally
    var minimumIntegerDigits: Number
    var minimumFractionDigits: Number
    var maximumFractionDigits: Number
    var minimumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maximumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useGrouping: Boolean
}
