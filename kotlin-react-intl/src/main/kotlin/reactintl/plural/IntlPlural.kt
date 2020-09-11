@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.plural

external interface IntlPluralFormatOptions {
    var type: PluralRuleType?
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
        get() = definedExternally
        set(value) = definedExternally
    var maximumSignificantDigits: Number?
        get() = definedExternally
        set(value) = definedExternally
}
