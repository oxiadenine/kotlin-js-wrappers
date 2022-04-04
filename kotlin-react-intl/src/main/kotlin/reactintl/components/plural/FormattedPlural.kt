@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.plural

import react.FC
import react.Props
import react.ReactElement
import react.ReactNode
import reactintl.FormatPluralOptions
import reactintl.IntlShape

@JsName("FormattedPlural")
external val FormattedPlural: FC<FormattedPluralProps>

external interface FormattedPluralProps : FormatPluralOptions, Props {
    var value: Number
    var intl: IntlShape
    var other: ReactNode
    var zero: ReactNode?
    var one: ReactNode?
    var two: ReactNode?
    var few: ReactNode?
    var many: ReactNode?
    var children: ((value: ReactNode?) -> ReactElement)?
}

external object IntlPlural {
    interface PluralRulesOptions {
        var localeMatcher: String? /* "lookup" | "best fit" */
        var type: IntlPluralRuleType?
        var minimumIntegerDigits: Number?
        var minimumFractionDigits: Number?
        var maximumFractionDigits: Number?
        var minimumSignificantDigits: Number?
        var maximumSignificantDigits: Number?
    }

    interface ResolvedPluralRulesOptions {
        var locale: String
        var pluralCategories: Array<IntlLDMLPluralRule>
        var type: IntlPluralRuleType
        var minimumIntegerDigits: Number
        var minimumFractionDigits: Number
        var maximumFractionDigits: Number
        var minimumSignificantDigits: Number?
        var maximumSignificantDigits: Number?
    }

    interface PluralRules {
        fun resolvedOptions(): ResolvedPluralRulesOptions
        fun select(n: Number): IntlLDMLPluralRule
    }
}
