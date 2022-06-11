package reactintl.components.relativetime

import reactintl.LocaleData
import reactintl.LocaleFieldsData

typealias RelativeTimeField = String /* "second" | "second-short" | "second-narrow" | "minute" | "minute-short" | "minute-narrow" | "hour" | "hour-short" | "hour-narrow" | "day" | "day-short" | "day-narrow" | "week" | "week-short" | "week-narrow" | "month" | "month-short" | "month-narrow" | "quarter" | "quarter-short" | "quarter-narrow" | "year" | "year-short" | "year-narrow" */
typealias RelativeTimeFormatSingularUnit = IntlRelativeTimeFormatUnit
typealias RelativeTimeLocaleData = LocaleData<LocaleFieldsData>

typealias IntlUnicodeBCP47LocaleIdentifier = String
typealias IntlRelativeTimeFormatUnit = String  /* "year" | "years" | "quarter" | "quarters" | "month" | "months" | "week" | "weeks" | "day" | "days" | "hour" | "hours" | "minute" | "minutes" | "second" | "seconds" */
typealias IntlRelativeTimeFormatLocaleMatcher = String /* "lookup" | "best fit" */
typealias IntlRelativeTimeFormatNumeric = String /* "always" | "auto" */
typealias IntlRelativeTimeFormatStyle = String /* "long" | "short" | "narrow" */