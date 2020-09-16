@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.plural

external interface IntlPluralFormatOptions {
    var type: PluralRuleType?
    var minimumIntegerDigits: Number?
    var minimumFractionDigits: Number?
    var maximumFractionDigits: Number?
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
}

external interface IntlPluralRules {
    fun resolvedOptions(): ResolvedPluralRulesOptions
    fun select(n: Number): LDMLPluralRule
}

external interface ResolvedPluralRulesOptions {
    var locale: String
    var pluralCategories: Array<LDMLPluralRule>
    var type: PluralRuleType
    var minimumIntegerDigits: Number
    var minimumFractionDigits: Number
    var maximumFractionDigits: Number
    var minimumSignificantDigits: Number?
    var maximumSignificantDigits: Number?
}
