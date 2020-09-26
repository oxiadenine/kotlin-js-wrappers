package antd.datepicker

import moment.*

typealias DatePickerMode = String /* "time" | "date" | "month" | "year" | "decade" */
typealias DatePickerSize = String /* "large" | "small" | "default" */

typealias RangePickerValue = Array<Moment>
typealias RangePickerPresetRange = Any /* RangePickerValue | () -> RangePickerValue */
