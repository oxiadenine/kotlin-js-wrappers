package moment

typealias RelativeTimeKey = String /* "s" | "ss" | "m" | "mm" | "h" | "hh" | "d" | "dd" | "M" | "MM" | "y" | "yy" */
typealias CalendarKey = String /* "sameDay" | "nextDay" | "lastDay" | "nextWeek" | "lastWeek" | "sameElse" */
typealias LongDateFormatKey = String /* "LTS" | "LT" | "L" | "LL" | "LLL" | "LLLL" | "lts" | "lt" | "l" | "ll" | "lll" | "llll" */

typealias CalendarSpecVal = Any /* String | ((m: MomentInput?, now: Moment?) -> String) */

typealias RelativeTimeSpecVal = Any /* (String | ((n: Number, withoutSuffix: Boolean, key: RelativeTimeKey, isFuture: Boolean) -> String)) */
typealias RelativeTimeFuturePastVal = Any /* String | ((relTime: String) -> String) */

typealias MonthWeekdayFn = (momentToFormat: Moment, format: String) -> String
typealias WeekdaySimpleFn = (momentToFormat: Moment) -> String

typealias MomentFormatSpecification = Any /* string | MomentBuiltinFormat | Array<(string | MomentBuiltinFormat)> */

typealias Base = Any /* ("year" | "years" | "y" | "month" | "months" | "M" | "week" | "weeks" | "w" | "day" | "days" | "d" | "hour" | "hours" | "h" | "minute" | "minutes" | "m" | "second" | "seconds" | "s" | "millisecond" | "milliseconds" | "ms") */

typealias _quarter = String /* "quarter" | "quarters" | "Q" */
typealias _isoWeek = String /* "isoWeek" | "isoWeeks" | "W" */
typealias _date = String  /* "date" | "dates" | "D" */
typealias DurationConstructor = Any /* Base | _quarter */

typealias DurationAs = Base

typealias StartOf = Any /* Base | _quarter | _isoWeek | _date */

typealias Diff = Any /* Base | _quarter */

typealias MomentConstructor = Any /* Base | _date */

typealias All = Any /* Base | _quarter | _isoWeek | _date | "weekYear" | "weekYears" | "gg" | "isoWeekYear" | "isoWeekYears" | "GG" | "dayOfYear" | "dayOfYears" | "DDD" | "weekday" | "weekdays" | "e" | "isoWeekday" | "isoWeekdays" | "E" */

typealias MomentInput = Any /* Moment | Date | String | Number | Array<(Number | String)> | MomentInputObject | Unit // null | undefined */
typealias DurationInputArg1 = Any /* Duration | Number | String | FromTo | DurationInputObject | Unit // null | undefined */
typealias DurationInputArg2 = DurationConstructor
typealias LocaleSpecifier = Any /* String | Moment | Duration | Array<String> | Boolean */
