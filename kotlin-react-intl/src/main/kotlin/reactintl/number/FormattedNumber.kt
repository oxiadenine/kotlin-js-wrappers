@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.number

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.*

@JsName("FormattedNumber")
external class FormattedNumberComponent : Component<FormattedNumberProps, RState> {
    override fun render(): ReactElement?
}

@JsName("FormattedNumberParts")
external class FormattedNumberPartsComponent : Component<FormattedNumberPartsProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedNumberProps : NumberFormatOptions, CustomFormatConfig, RProps {
    var value: Number
}

external interface FormattedNumberPartsProps : NumberFormatOptions, CustomFormatConfig, RProps {
    var value: Number
    fun children(value: NumberFormatPartTypes): ReactElement?
}

external interface NumberFormatOptions : IntlNumberFormatOptions, NumberFormatDigitOptions, CustomFormatConfig {
    override var style: NumberFormatOptionsStyle?
        get() = definedExternally
        set(value) = definedExternally
    var comvpactDisplay: NumberFormatOptionsCompactDisplay?
        get() = definedExternally
        set(value) = definedExternally
    override var currencyDisplay: NumberFormatOptionsCurrencyDisplay?
        get() = definedExternally
        set(value) = definedExternally
    override var minimumIntegerDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var minimumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var minimumFractionDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var maximumFractionDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var maximumSignificantDigits: Number?
    var currencySign: NumberFormatOptionsCurrencySign?
        get() = definedExternally
        set(value) = definedExternally
    var notation: NumberFormatOptionsNotation?
        get() = definedExternally
        set(value) = definedExternally
    var signDisplay: NumberFormatOptionsSignDisplay?
        get() = definedExternally
        set(value) = definedExternally
    var unit: String?
        get() = definedExternally
        set(value) = definedExternally
    var unitDisplay: NumberFormatOptionsUnitDisplay?
        get() = definedExternally
        set(value) = definedExternally
    var numberingSystem: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NumberFormatDigitOptions {
    var minimumIntegerDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minimumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maximumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minimumFractionDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maximumFractionDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
}
