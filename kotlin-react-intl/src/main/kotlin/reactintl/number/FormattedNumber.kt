@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.number

import react.*
import reactintl.*

@JsName("FormattedNumber")
external class FormattedNumberComponent : Component<FormattedNumberProps, State> {
    override fun render(): ReactElement?
}

@JsName("FormattedNumberParts")
external class FormattedNumberPartsComponent : Component<FormattedNumberPartsProps, State> {
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
    var comvpactDisplay: NumberFormatOptionsCompactDisplay?
    override var currencyDisplay: NumberFormatOptionsCurrencyDisplay?
    override var minimumIntegerDigits: Number?
    override var minimumSignificantDigits: Number?
    override var minimumFractionDigits: Number?
    override var maximumFractionDigits: Number?
    override var maximumSignificantDigits: Number?
    var currencySign: NumberFormatOptionsCurrencySign?
    var notation: NumberFormatOptionsNotation?
    var signDisplay: NumberFormatOptionsSignDisplay?
    var unit: String?
    var unitDisplay: NumberFormatOptionsUnitDisplay?
    var numberingSystem: String?
}

external interface NumberFormatDigitOptions {
    var minimumIntegerDigits: Number?
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
    var minimumFractionDigits: Number?
    var maximumFractionDigits: Number?
}
