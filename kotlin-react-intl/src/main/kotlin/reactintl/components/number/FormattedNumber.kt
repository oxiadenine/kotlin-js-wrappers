@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.number

import kotlinx.js.Record
import react.FC
import react.Props
import react.ReactNode
import reactintl.FormatNumberOptions
import reactintl.components.plural.IntlPlural

@JsName("FormattedNumber")
external val FormattedNumber: FC<FormattedNumberProps>

@JsName("FormattedNumberParts")
external val FormattedNumberParts: FC<FormattedNumberPartsProps>

external interface FormattedNumberProps : FormatNumberOptions, Props {
    var value: Number
}

external interface FormattedNumberPartsProps : FormatNumberOptions, Props {
    var value: Number
    var children: (Array<IntlNumber.NumberFormatPart>) -> ReactNode?
}

external interface NumberFormatDigitOptions {
    var minimumIntegerDigits: Number?
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
    var minimumFractionDigits: Number?
    var maximumFractionDigits: Number?
}

external interface NumberFormatDigitInternalSlots {
    var minimumIntegerDigits: Number
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
    var roundingType: NumberFormatRoundingType
    var minimumFractionDigits: Number?
    var maximumFractionDigits: Number?
    var notation: NumberFormatNotation?
}

external interface NumberFormatLocaleInternalData {
    var units: UnitDataTable
    var currencies: Record<String, CurrencyData>
    var numbers: RawNumberData
    var nu: Array<String>
}

external interface UnitDataTable {
    var simple: Record<String, UnitData>
    var compound: Record<String, CompoundUnitData>
}

external interface UnitData {
    var long: LDMLPluralRuleMap<String>
    var short: LDMLPluralRuleMap<String>
    var narrow: LDMLPluralRuleMap<String>
    var perUnit: Record<String /* "narrow" | "short" | "long" */, String>
}

external interface CompoundUnitData {
    var long: String
    var short: String
    var narrow: String
}

external interface CurrencyData {
    var displayName: LDMLPluralRuleMap<String>
    var symbol: String
    var narrow: String
}

external interface CurrencySpacingData {
    var beforeInsertBetween: String
    var afterInsertBetween: String
}

external interface RawCurrencyData {
    var currencySpacing: CurrencySpacingData
    var standard: String
    var accounting: String
    var short: Record<DecimalFormatNum, LDMLPluralRuleMap<String>>?
    var unitPattern: String
}

external interface SymbolsData {
    var decimal: String
    var group: String
    var list: String
    var percentSign: String
    var plusSign: String
    var minusSign: String
    var exponential: String
    var superscriptingExponent: String
    var perMille: String
    var infinity: String
    var nan: String
    var timeSeparator: String
}

external interface RawNumberData {
    var nu: Array<String>
    var symbols: Record<NumberingSystem, SymbolsData>
    var decimal: Record<NumberingSystem, DecimalSymbolsData>
    var percent: Record<NumberingSystem, String>
    var currency: Record<NumberingSystem, RawCurrencyData>
}

external interface DecimalSymbolsData {
    var standard: String
    var long: Record<DecimalFormatNum, LDMLPluralRuleMap<String>>
    var short: Record<DecimalFormatNum, LDMLPluralRuleMap<String>>
}

external interface RawNumberFormatResult {
    var formattedString: String
    var roundedNumber: Number
    var integerDigitsCount: Number
}

external interface NumberFormatInternal : NumberFormatDigitInternalSlots {
    var locale: String
    var dataLocale: String
    var style: NumberFormatOptionsStyle
    var currency: String?
    var currencyDisplay: NumberFormatOptionsCurrencyDisplay?
    var unit: String?
    var unitDisplay: NumberFormatOptionsUnitDisplay
    var currencySign: NumberFormatOptionsCurrencySign
    override var notation: NumberFormatOptionsNotation?
    var compactDisplay: NumberFormatOptionsCompactDisplay
    var signDisplay: NumberFormatOptionsSignDisplay
    var useGrouping: Boolean
    var pl: IntlPlural.PluralRules
    var boundFormat: ((value: Number) -> String)?
    var numberingSystem: String
    var dataLocaleData: NumberFormatLocaleInternalData
}

external interface NumberFormatOptions : IntlNumber.NumberFormatOptions, NumberFormatDigitOptions {
    override var localeMatcher: NumberFormatOptionsLocaleMatcher?
    override var style: NumberFormatOptionsStyle?
    var compactDisplay: NumberFormatOptionsCompactDisplay?
    override var currencyDisplay: NumberFormatOptionsCurrencyDisplay?
    var currencySign: NumberFormatOptionsCurrencySign?
    var notation: NumberFormatOptionsNotation?
    var signDisplay: NumberFormatOptionsSignDisplay?
    var unit: String?
    var unitDisplay: NumberFormatOptionsUnitDisplay?
    var numberingSystem: String?
    var trailingZeroDisplay: String? /* "auto" | "stripIfInteger" */
    var roundingPriority: String? /* "auto" | "morePrecision" | "lessPrecision" */
}

external interface ResolvedNumberFormatOptions : IntlNumber.ResolvedNumberFormatOptions, NumberFormatInternal

external interface NumberFormatPart {
    var type: NumberFormatPartTypes
    var value: String
}

external object IntlNumber {
    interface NumberFormatOptions {
        var localeMatcher: String?
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

    interface NumberFormat {
        fun format(value: Number): String
        fun resolvedOptions(): ResolvedNumberFormatOptions
    }

    interface NumberFormatPart {
        var type: NumberFormatPartTypes
        var value: String
    }

    interface ResolvedNumberFormatOptions {
        var locale: String
        var numberingSystem: String
        var style: String
        var currency: String?
        var currencyDisplay: String?
        var minimumIntegerDigits: Number
        var minimumFractionDigits: Number?
        var maximumFractionDigits: Number?
        var minimumSignificantDigits: Number?
        var maximumSignificantDigits: Number?
        var useGrouping: Boolean
    }
}