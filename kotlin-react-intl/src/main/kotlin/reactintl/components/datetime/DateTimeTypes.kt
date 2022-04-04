package reactintl.components.datetime

import kotlinx.js.Record

typealias TABLE_6 = String /* "weekday" | "era" | "year" | "month" | "day" | "hour" | "minute" | "second" | "fractionalSecondDigits" | "timeZoneName" */
typealias TABLE_2 = String /* "era" | "year" | "month" | "day" | "dayPeriod" | "ampm" | "hour" | "minute" | "second" | "fractionalSecondDigits" */
typealias TimeZoneName = Record<String, TimeZoneNameData>
typealias UnpackedZoneData = Array<Any /* String | Number | Boolean */>
typealias DateTimeFormatPartType = Any /* IntlDateTimeFormatPartTypes | "ampm" | "relatedYear" | "yearName" | "unknown" | "fractionalSecondDigits" */

typealias IntlDateTimeFormatPartTypes = String /* "day" | "dayPeriod" | "era" | "hour" | "literal" | "minute" | "month" | "second" | "timeZoneName" | "weekday" | "year" */
