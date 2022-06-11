package reactintl.components.number

import kotlinx.js.Record
import reactintl.LocaleData
import reactintl.components.plural.IntlLDMLPluralRule

typealias NumberFormatNotation = String /* "standard" | "scientific" | "engineering" | "compact" */
typealias NumberFormatRoundingType = String /* "significantDigits" | "fractionDigits" | "compactRounding" */
typealias DecimalFormatNum = String /* "1000" | "10000" | "100000" | "1000000" | "10000000" | "100000000" | "1000000000" | "10000000000" | "100000000000" | "1000000000000" | "10000000000000" | "100000000000000" */
typealias NumberingSystem = String
typealias LDMLPluralRuleMap<T> = Record<IntlLDMLPluralRule, T>
typealias NumberFormatOptionsLocaleMatcher = String /* "lookup" | "best fit" */
typealias NumberFormatOptionsStyle = String /* "decimal" | "percent" | "currency" | "unit" */
typealias NumberFormatOptionsCompactDisplay = String /* "short" | "long" */
typealias NumberFormatOptionsCurrencyDisplay = String /* "symbol" | "code" | "name" | "narrowSymbol" */
typealias NumberFormatOptionsCurrencySign = String /* "standard" | "accounting" */
typealias NumberFormatOptionsNotation = String /* NumberFormatNotation | "standard" | "scientific" | "engineering" | "compact" */
typealias NumberFormatOptionsSignDisplay = String /* "auto" | "always" | "never" | "exceptZero" */
typealias NumberFormatOptionsUnitDisplay = String /* "long" | "short" | "narrow" */
typealias NumberFormatPartTypes = String /* IntlNumberFormatPartTypes | "exponentSeparator" | "exponentMinusSign" | "exponentInteger" | "compact" | "unit" | "literal" */
typealias RawNumberLocaleData = LocaleData<NumberFormatLocaleInternalData>

typealias IntlNumberFormatPartTypes = String /* "exponentInteger" | "exponentMinusSign" | "exponentSeparator" | "fraction" | "group" | "infinity" | "integer" | "literal" | "minusSign" | "nan" | "plusSign" | "percentSign" | "unit" | "unknown" */