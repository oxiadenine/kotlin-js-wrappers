@file:JsModule("moment")
@file:JsNonModule

package moment

import kotlin.js.Date
import kotlin.js.RegExp

external interface Locale {
    fun calendar(
        key: CalendarKey? = definedExternally,
        m: Moment? = definedExternally,
        now: Moment? = definedExternally
    ): String

    fun longDateFormat(key: LongDateFormatKey): String
    fun invalidDate(): String
    fun ordinal(n: Number): String

    fun preparse(inp: String): String
    fun postformat(inp: String): String
    fun relativeTime(
        n: Number,
        withoutSuffix: Boolean,
        key: RelativeTimeKey,
        isFuture: Boolean
    ): String

    fun pastFuture(diff: Number, absRelTime: String): String
    fun set(config: Any)

    fun months(): Array<String>
    fun months(m: Moment, format: String? = definedExternally): String
    fun monthsShort(): Array<String>
    fun monthsShort(m: Moment, format: String? = definedExternally): String
    fun monthsParse(monthName: String, format: String, strict: Boolean): Number
    fun monthsRegex(strict: Boolean): RegExp
    fun monthsShortRegex(strict: Boolean): RegExp

    fun week(m: Moment): Number
    fun firstDayOfYear(): Number
    fun firstDayOfWeek(): Number

    fun weekdays(): Array<String>
    fun weekdays(m: Moment, format: String? = definedExternally): String
    fun weekdaysMin(): Array<String>
    fun weekdaysMin(m: Moment): String
    fun weekdaysShort(): Array<String>
    fun weekdaysShort(m: Moment): String
    fun weekdaysParse(weekdayName: String, format: String, strict: Boolean): Number
    fun weekdaysRegex(strict: Boolean): RegExp
    fun weekdaysShortRegex(strict: Boolean): RegExp
    fun weekdaysMinRegex(strict: Boolean): RegExp

    fun isPM(input: String): Boolean
    fun meridiem(hour: Number, minute: Number, isLower: Boolean): String
}

external interface StandaloneFormatSpec {
    var format: Array<String>
    var standalone: Array<String>
    var isFormat: RegExp?
}

external interface WeekSpec {
    var dow: Number
    var doy: Number?
}

external interface CalendarSpec {
    var sameDay: CalendarSpecVal?
    var nextDay: CalendarSpecVal?
    var lastDay: CalendarSpecVal?
    var nextWeek: CalendarSpecVal?
    var lastWeek: CalendarSpecVal?
    var sameElse: CalendarSpecVal?

    // any additional properties might be used with moment.calendarFormat
    /* [x: String]: CalendarSpecVal | Unit // undefined */
}

external interface RelativeTimeSpec {
    var future: RelativeTimeFuturePastVal?
    var past: RelativeTimeFuturePastVal?
    var s: RelativeTimeSpecVal?
    var ss: RelativeTimeSpecVal?
    var m: RelativeTimeSpecVal?
    var mm: RelativeTimeSpecVal?
    var h: RelativeTimeSpecVal?
    var hh: RelativeTimeSpecVal?
    var d: RelativeTimeSpecVal?
    var dd: RelativeTimeSpecVal?
    var w: RelativeTimeFuturePastVal?
    var M: RelativeTimeSpecVal?
    var MM: RelativeTimeSpecVal?
    var y: RelativeTimeSpecVal?
    var yy: RelativeTimeSpecVal?
}

external interface LongDateFormatSpec {
    var LTS: String
    var LT: String
    var L: String
    var LL: String
    var LLL: String
    var LLLL: String

    // lets forget for a sec that any upper/lower permutation will also work
    var lts: String?
    var lt: String?
    var l: String?
    var ll: String?
    var lll: String?
    var llll: String?
}

external interface EraSpec {
    var since: Any /* String | Number */
    var until: Any /* String | Number */
    var offset: Number
    var name: String
    var narrow: String
    var abbr: String
}

external interface LocaleSpecification {
    var months: Any? /* Array<String> | StandaloneFormatSpec | MonthWeekdayFn */
    var monthsShort: Any? /* Array<String>| StandaloneFormatSpec | MonthWeekdayFn */

    var weekdays: Any? /* Array<String> | StandaloneFormatSpec | MonthWeekdayFn */
    var weekdaysShort: Any? /* Array<String> | StandaloneFormatSpec | WeekdaySimpleFn */
    var weekdaysMin: Any? /* Array<String> | StandaloneFormatSpec | WeekdaySimpleFn */

    var meridiemParse: RegExp?
    var meridiem: ((hour: Number, minute: Number, isLower: Boolean) -> String)?

    var isPM: ((input: String) -> Boolean)?

    var longDateFormat: LongDateFormatSpec?
    var calendar: CalendarSpec?
    var relativeTime: RelativeTimeSpec?
    var invalidDate: String?
    var ordinal: ((n: Number) -> String)?
    var ordinalParse: RegExp?

    var week: WeekSpec?
    var eras: Array<EraSpec>?

    // Allow anything: in general any property that is passed as locale spec is
    // put in the locale object so it can be used by locale functions
    /* [x: String]: Any */
}

external interface MomentObjectOutput {
    var years: Number

    /* One digit */
    var months: Number

    /* Day of the month */
    var date: Number
    var hours: Number
    var minutes: Number
    var seconds: Number
    var milliseconds: Number
}

external interface ArgThresholdOpts {
    var ss: Number?
    var s: Number?
    var m: Number?
    var h: Number?
    var d: Number?
    var w: Any? /* Number | Unit */
    var M: Number?
}

external interface Duration {
    fun clone(): Duration

    fun humanize(withSuffix: Boolean? = definedExternally, argThresholds: ArgThresholdOpts? = definedExternally): String

    fun abs(): Duration

    fun `as`(units: Base): Number
    fun get(units: Base): Number

    fun milliseconds(): Number
    fun asMilliseconds(): Number

    fun seconds(): Number
    fun asSeconds(): Number

    fun minutes(): Number
    fun asMinutes(): Number

    fun hours(): Number
    fun asHours(): Number

    fun days(): Number
    fun asDays(): Number

    fun weeks(): Number
    fun asWeeks(): Number

    fun months(): Number
    fun asMonths(): Number

    fun years(): Number
    fun asYears(): Number

    fun add(inp: DurationInputArg1? = definedExternally, unit: DurationInputArg2? = definedExternally): Duration
    fun subtract(inp: DurationInputArg1? = definedExternally, unit: DurationInputArg2? = definedExternally): Duration

    fun locale(): String
    fun locale(locale: LocaleSpecifier): Duration
    fun localeData(): Locale

    fun toISOString(): String
    fun toJSON(): String

    fun isValid(): Boolean

    /**
     * @deprecated since version 2.8.0
     */
    fun lang(locale: LocaleSpecifier): Moment

    /**
     * @deprecated since version 2.8.0
     */
    fun lang(): Locale

    /**
     * @deprecated
     */
    fun toIsoString(): String
}

external interface MomentRelativeTime {
    var future: Any
    var past: Any
    var s: Any
    var ss: Any
    var m: Any
    var mm: Any
    var h: Any
    var hh: Any
    var d: Any
    var dd: Any
    var M: Any
    var MM: Any
    var y: Any
    var yy: Any
}

external interface MomentLongDateFormat {
    var L: String
    var LL: String
    var LLL: String
    var LLLL: String
    var LT: String
    var LTS: String

    var l: String?
    var ll: String?
    var lll: String?
    var llll: String?
    var lt: String?
    var lts: String?
}

external interface MomentParsingFlags {
    var empty: Boolean
    var unusedTokens: Array<String>
    var unusedInput: Array<String>
    var overflow: Number
    var charsLeftOver: Number
    var nullInput: Boolean
    var invalidMonth: Any /* String | Unit // null */
    var invalidFormat: Boolean
    var userInvalidated: Boolean
    var iso: Boolean
    var parsedDateParts: Array<Any>
    var meridiem: Any? /* String | Unit */
}

external interface MomentParsingFlagsOpt {
    var empty: Boolean?
    var unusedTokens: Array<String>?
    var unusedInput: Array<String>?
    var overflow: Number?
    var charsLeftOver: Number?
    var nullInput: Boolean?
    var invalidMonth: String?
    var invalidFormat: Boolean?
    var userInvalidated: Boolean?
    var iso: Boolean?
    var parsedDateParts: Array<Any>?
    var meridiem: String?
}

external interface MomentBuiltinFormat {
    var __momentBuiltinFormatBrand: Any
}

external interface MomentInputObject {
    var years: NumberLike?
    var year: NumberLike?
    var y: NumberLike?

    var months: NumberLike?
    var month: NumberLike?
    var M: NumberLike?

    var days: NumberLike?
    var day: NumberLike?
    var d: NumberLike?

    var dates: NumberLike?
    var date: NumberLike?
    var D: NumberLike?

    var hours: NumberLike?
    var hour: NumberLike?
    var h: NumberLike?

    var minutes: NumberLike?
    var minute: NumberLike?
    var m: NumberLike?

    var seconds: NumberLike?
    var second: NumberLike?
    var s: NumberLike?

    var milliseconds: NumberLike?
    var millisecond: NumberLike?
    var ms: NumberLike?
}

external interface DurationInputObject : MomentInputObject {
    var quarters: NumberLike?
    var quarter: NumberLike?
    var Q: NumberLike?

    var weeks: NumberLike?
    var week: NumberLike?
    var w: NumberLike?
}

external interface MomentSetObject : MomentInputObject {
    var weekYears: NumberLike?
    var weekYear: NumberLike?
    var gg: NumberLike?

    var isoWeekYears: NumberLike?
    var isoWeekYear: NumberLike?
    var GG: NumberLike?

    var quarters: NumberLike?
    var quarter: NumberLike?
    var Q: NumberLike?

    var weeks: NumberLike?
    var week: NumberLike?
    var w: NumberLike?

    var isoWeeks: NumberLike?
    var isoWeek: NumberLike?
    var W: NumberLike?

    var dayOfYears: NumberLike?
    var dayOfYear: NumberLike?
    var DDD: NumberLike?

    var weekdays: NumberLike?
    var weekday: NumberLike?
    var e: NumberLike?

    var isoWeekdays: NumberLike?
    var isoWeekday: NumberLike?
    var E: NumberLike?
}

external interface FromTo {
    var from: MomentInput
    var to: MomentInput
}

external interface MomentCreationData {
    var input: MomentInput
    var format: MomentFormatSpecification?
    var locale: Locale
    var isUTC: Boolean
    var strict: Boolean?
}

external interface Moment {
    fun format(format: String? = definedExternally): String

    fun startOf(unitOfTime: StartOf): Moment
    fun endOf(unitOfTime: StartOf): Moment

    fun add(amount: DurationInputArg1? = definedExternally, unit: DurationInputArg2? = definedExternally): Moment

    /**
     * @deprecated reverse syntax
     */
    fun add(unit: DurationConstructor, amount: Any /* Number | String */): Moment

    fun subtract(amount: DurationInputArg1? = definedExternally, unit: DurationInputArg2? = definedExternally): Moment

    /**
     * @deprecated reverse syntax
     */
    fun subtract(unit: DurationConstructor, amount: Any /* Number | String */): Moment

    fun calendar(): String
    fun calendar(formats: CalendarSpec): String
    fun calendar(time: MomentInput, formats: CalendarSpec? = definedExternally): String

    fun clone(): Moment

    /**
     * @return Unix timestamp in milliseconds
     */
    fun valueOf(): Number

    // current date/time in local mode
    fun local(keepLocalTime: Boolean? = definedExternally): Moment
    fun isLocal(): Boolean

    // current date/time in UTC mode
    fun utc(keepLocalTime: Boolean? = definedExternally): Moment
    fun isUTC(): Boolean

    /**
     * @deprecated use isUTC
     */
    fun isUtc(): Boolean

    fun parseZone(): Moment
    fun isValid(): Boolean
    fun invalidAt(): Number

    fun hasAlignedHourOffset(other: MomentInput? = definedExternally): Boolean

    fun creationData(): MomentCreationData
    fun parsingFlags(): MomentParsingFlags

    fun year(y: Number): Moment
    fun year(): Number

    /**
     * @deprecated use year(y)
     */
    fun years(y: Number): Moment

    /**
     * @deprecated use year()
     */
    fun years(): Number
    fun quarter(): Number
    fun quarter(q: Number): Moment
    fun quarters(): Number
    fun quarters(q: Number): Moment
    fun month(M: Any /* Number | String */): Moment
    fun month(): Number

    /**
     * @deprecated use month(M)
     */
    fun months(M: Any /* Number | String */): Moment

    /**
     * @deprecated use month()
     */
    fun months(): Number
    fun day(d: Any /* Number | String */): Moment
    fun day(): Number
    fun days(d: Any /* Number | String */): Moment
    fun days(): Number
    fun date(d: Number): Moment
    fun date(): Number

    /**
     * @deprecated use date(d)
     */
    fun dates(d: Number): Moment

    /**
     * @deprecated use date()
     */
    fun dates(): Number
    fun hour(h: Number): Moment
    fun hour(): Number
    fun hours(h: Number): Moment
    fun hours(): Number
    fun minute(m: Number): Moment
    fun minute(): Number
    fun minutes(m: Number): Moment
    fun minutes(): Number
    fun second(s: Number): Moment
    fun second(): Number
    fun seconds(s: Number): Moment
    fun seconds(): Number
    fun millisecond(ms: Number): Moment
    fun millisecond(): Number
    fun milliseconds(ms: Number): Moment
    fun milliseconds(): Number
    fun weekday(): Number
    fun weekday(d: Number): Moment
    fun isoWeekday(): Number
    fun isoWeekday(d: Any /* Number | String */): Moment
    fun weekYear(): Number
    fun weekYear(d: Number): Moment
    fun isoWeekYear(): Number
    fun isoWeekYear(d: Number): Moment
    fun week(): Number
    fun week(d: Number): Moment
    fun weeks(): Number
    fun weeks(d: Number): Moment
    fun isoWeek(): Number
    fun isoWeek(d: Number): Moment
    fun isoWeeks(): Number
    fun isoWeeks(d: Number): Moment
    fun weeksInYear(): Number
    fun weeksInWeekYear(): Number
    fun isoWeeksInYear(): Number
    fun isoWeeksInISOWeekYear(): Number
    fun dayOfYear(): Number
    fun dayOfYear(d: Number): Moment

    fun from(inp: MomentInput, suffix: Boolean? = definedExternally): String
    fun to(inp: MomentInput, suffix: Boolean? = definedExternally): String
    fun fromNow(withoutSuffix: Boolean? = definedExternally): String
    fun toNow(withoutPrefix: Boolean? = definedExternally): String

    fun diff(b: MomentInput, unitOfTime: Diff? = definedExternally, precise: Boolean? = definedExternally): Number

    fun toArray(): Array<Number>
    fun toDate(): Date
    fun toISOString(keepOffset: Boolean? = definedExternally): String
    fun inspect(): String
    fun toJSON(): String
    fun unix(): Number

    fun isLeapYear(): Boolean

    /**
     * @deprecated in favor of utcOffset
     */
    fun zone(): Number
    fun zone(b: Any /* Number | String */): Moment
    fun utcOffset(): Number
    fun utcOffset(b: Any /* Number | String */, keepLocalTime: Boolean? = definedExternally): Moment
    fun isUtcOffset(): Boolean
    fun daysInMonth(): Number
    fun isDST(): Boolean

    fun zoneAbbr(): String
    fun zoneName(): String

    fun isBefore(inp: MomentInput? = definedExternally, granularity: StartOf? = definedExternally): Boolean
    fun isAfter(inp: MomentInput? = definedExternally, granularity: StartOf? = definedExternally): Boolean
    fun isSame(inp: MomentInput? = definedExternally, granularity: StartOf? = definedExternally): Boolean
    fun isSameOrAfter(inp: MomentInput? = definedExternally, granularity: StartOf? = definedExternally): Boolean
    fun isSameOrBefore(inp: MomentInput? = definedExternally, granularity: StartOf? = definedExternally): Boolean
    fun isBetween(
        a: MomentInput,
        b: MomentInput,
        granularity: StartOf? = definedExternally,
        inclusivity: String? = definedExternally /* "()" | "[)" | "(]" | "[]" */
    ): Boolean

    /**
     * @deprecated as of 2.8.0, use locale
     */
    fun lang(language: LocaleSpecifier): Moment

    /**
     * @deprecated as of 2.8.0, use locale
     */
    fun lang(): Locale

    fun locale(): String
    fun locale(locale: LocaleSpecifier): Moment

    fun localeData(): Locale

    /**
     * @deprecated no reliable implementation
     */
    fun isDSTShifted(): Boolean

    // NOTE(constructor): Same as moment constructor
    /**
     * @deprecated as of 2.7.0, use moment.min/max
     */
    fun max(
        inp: MomentInput? = definedExternally,
        format: MomentFormatSpecification? = definedExternally,
        strict: Boolean? = definedExternally
    ): Moment

    /**
     * @deprecated as of 2.7.0, use moment.min/max
     */
    fun max(
        inp: MomentInput? = definedExternally,
        format: MomentFormatSpecification? = definedExternally,
        language: String? = definedExternally,
        strict: Boolean? = definedExternally
    ): Moment

    // NOTE(constructor): Same as moment constructor
    /**
     * @deprecated as of 2.7.0, use moment.min/max
     */
    fun min(
        inp: MomentInput? = definedExternally,
        format: MomentFormatSpecification? = definedExternally,
        strict: Boolean? = definedExternally
    ): Moment

    /**
     * @deprecated as of 2.7.0, use moment.min/max
     */
    fun min(
        inp: MomentInput? = definedExternally,
        format: MomentFormatSpecification? = definedExternally,
        language: String? = definedExternally,
        strict: Boolean? = definedExternally
    ): Moment

    fun get(unit: All): Number
    fun set(unit: All, value: Number): Moment
    fun set(objectLiteral: MomentSetObject): Moment

    fun toObject(): MomentObjectOutput
}

external var version: String
external var fn: Moment

// NOTE(constructor): Same as moment constructor
external fun utc(
    inp: MomentInput? = definedExternally,
    format: MomentFormatSpecification? = definedExternally,
    strict: Boolean? = definedExternally
): Moment

external fun utc(
    inp: MomentInput? = definedExternally,
    format: MomentFormatSpecification? = definedExternally,
    language: String? = definedExternally,
    strict: Boolean? = definedExternally
): Moment

external fun unix(timestamp: Number): Moment

external fun invalid(flags: MomentParsingFlagsOpt? = definedExternally): Moment
external fun isMoment(m: Any): Boolean
external fun isDate(m: Any): Boolean
external fun isDuration(d: Any): Boolean

/**
 * @deprecated in 2.8.0
 */
external fun lang(language: String? = definedExternally): String

/**
 * @deprecated in 2.8.0
 */
external fun lang(language: String? = definedExternally, definition: Locale? = definedExternally): String

external fun locale(language: String? = definedExternally): String
external fun locale(language: Array<String>? = definedExternally): String
external fun locale(
    language: String? = definedExternally,
    definition: Any? = definedExternally /* LocaleSpecification | Unit */
): String

external fun localeData(key: Any? = definedExternally /* String | Array<String> */): Locale

external fun duration(
    inp: DurationInputArg1? = definedExternally,
    unit: DurationInputArg2? = definedExternally
): Duration

// NOTE(constructor): Same as moment constructor
external fun parseZone(
    inp: MomentInput? = definedExternally,
    format: MomentFormatSpecification? = definedExternally,
    strict: Boolean? = definedExternally
): Moment

external fun parseZone(
    inp: MomentInput? = definedExternally,
    format: MomentFormatSpecification? = definedExternally,
    language: String? = definedExternally,
    strict: Boolean? = definedExternally
): Moment

external fun months(): Array<String>
external fun months(index: Number): String
external fun months(format: String): Array<String>
external fun months(format: String, index: Number): String
external fun monthsShort(): Array<String>
external fun monthsShort(index: Number): String
external fun monthsShort(format: String): Array<String>
external fun monthsShort(format: String, index: Number): String

external fun weekdays(): Array<String>
external fun weekdays(index: Number): String
external fun weekdays(format: String): Array<String>
external fun weekdays(format: String, index: Number): String
external fun weekdays(localeSorted: Boolean): Array<String>
external fun weekdays(localeSorted: Boolean, index: Number): String
external fun weekdays(localeSorted: Boolean, format: String): Array<String>
external fun weekdays(localeSorted: Boolean, format: String, index: Number): String
external fun weekdaysShort(): Array<String>
external fun weekdaysShort(index: Number): String
external fun weekdaysShort(format: String): Array<String>
external fun weekdaysShort(format: String, index: Number): String
external fun weekdaysShort(localeSorted: Boolean): Array<String>
external fun weekdaysShort(localeSorted: Boolean, index: Number): String
external fun weekdaysShort(localeSorted: Boolean, format: String): Array<String>
external fun weekdaysShort(localeSorted: Boolean, format: String, index: Number): String
external fun weekdaysMin(): Array<String>
external fun weekdaysMin(index: Number): String
external fun weekdaysMin(format: String): Array<String>
external fun weekdaysMin(format: String, index: Number): String
external fun weekdaysMin(localeSorted: Boolean): Array<String>
external fun weekdaysMin(localeSorted: Boolean, index: Number): String
external fun weekdaysMin(localeSorted: Boolean, format: String): Array<String>
external fun weekdaysMin(localeSorted: Boolean, format: String, index: Number): String

external fun min(moments: Array<Moment>): Moment
external fun min(vararg moments: Moment): Moment
external fun max(moments: Array<Moment>): Moment
external fun max(vararg moments: Moment): Moment

/**
 * Returns unix time in milliseconds. Overwrite for profit.
 */
external fun now(): Number

external fun defineLocale(language: String, localeSpec: Any /* LocaleSpecification | Unit */): Locale // null
external fun updateLocale(language: String, localeSpec: Any /* LocaleSpecification | Unit */): Locale // null

external fun locales(): Array<String>

external fun normalizeUnits(unit: All): String
external fun relativeTimeThreshold(threshold: String): Any /* Number | Boolean */
external fun relativeTimeThreshold(threshold: String, limit: Number): Boolean
external fun relativeTimeRounding(fn: (num: Number) -> Number): Boolean
external fun relativeTimeRounding(): (num: Number) -> Number
external fun calendarFormat(m: Moment, now: Moment): String

external fun parseTwoDigitYear(input: String): Number

/**
 * Constant used to enable explicit ISO_8601 format parsing.
 */
external var ISO_8601: MomentBuiltinFormat
external var RFC_2822: MomentBuiltinFormat

external var defaultFormat: String
external var defaultFormatUtc: String

external object HTML5_FMT {
    var DATETIME_LOCAL: String
    var DATETIME_LOCAL_SECONDS: String
    var DATETIME_LOCAL_MS: String
    var DATE: String
    var TIME: String
    var TIME_SECONDS: String
    var TIME_MS: String
    var WEEK: String
    var MONTH: String
}
