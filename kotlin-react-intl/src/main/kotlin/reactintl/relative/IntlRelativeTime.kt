@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.relative

import reactintl.LocaleFieldsData
import reactintl.number.IntlNumberFormat
import reactintl.plural.IntlPluralRules

external interface IntlRelativeTimeFormatOptions {
    var numeric: String? /* "always" | "auto" */
    var style: String? /* "long" | "short" | "narrow" */
}

external interface IntlRelativeTimeFormat {
    fun format(value: Number, unit: RelativeTimeFormattableUnit): String
    fun formatToParts(value: Number, unit: RelativeTimeFormattableUnit): Array<RelativeTimePart>
    fun resolvedOptions(): ResolvedRelativeTimeFormatOptions
}

external interface RelativeTimeFormatInternal {
    var numberFormat: IntlNumberFormat
    var pluralRules: IntlPluralRules
    var locale: String
    var fields: LocaleFieldsData
    var style: String? /* "long" | "short" | "narrow" */
    var numeric: String? /* "always" | "auto" */
    var numberingSystem: String
    var initializedRelativeTimeFormat: Boolean
}

external interface ResolvedRelativeTimeFormatOptions {
    var locale: String
    var numberingSystem: String
    var numeric: String? /* "always" | "auto" */
    var style: String? /* "long" | "short" | "narrow" */
}
