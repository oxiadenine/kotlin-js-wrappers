package antd.datepicker

import moment.Moment

typealias DatePickerMode = String /* "time" | "date" | "month" | "year" | "decade" */
typealias DatePickerSize = String /* "large" | "small" | "default" */

typealias RangePickerValue = Array<Moment>
typealias RangePickerPresetRange = Any /* RangePickerValue | () -> RangePickerValue */
