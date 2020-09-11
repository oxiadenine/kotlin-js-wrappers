package reactintl.relative

import reactintl.LocaleData
import reactintl.LocaleFieldsData

typealias RelativeTimeField = String /* "second" | "second-short" | "second-narrow" | "minute" | "minute-short" | "minute-narrow" | "hour" | "hour-short" | "hour-narrow" | "day" | "day-short" | "day-narrow" | "week" | "week-short" | "week-narrow" | "month" | "month-short" | "month-narrow" | "quarter" | "quarter-short" | "quarter-narrow" | "year" | "year-short" | "year-narrow" */
typealias RelativeTimeLocaleData = LocaleData<LocaleFieldsData>
typealias RelativeTimeUnit = String /* "second" | "minute" | "hour" | "day" | "week" | "month" | "quarter" | "year" */
typealias RelativeTimeUnits = String /* "seconds" | "minutes" | "hours" | "days" | "weeks" | "months" | "quarters" | "years" */
typealias RelativeTimeFormattableUnit = Any /* RelativeTimeUnit | RelativeTimeUnits */
typealias RelativeTimePart = Any /* LiteralPart | RelativeTimeFormatNumberPart */
