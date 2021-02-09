package antd.datepicker

typealias AlignPoint = String

typealias PanelMode = String /* "time" | "date" | "week" | "month" | "quarter" | "year" | "decade" */

typealias DisabledTime<DateType> = (date: DateType?) -> DisabledTimes
typealias OnPanelChange<DateType> = (value: DateType, mode: PanelMode) -> Unit
typealias RangeValue<DateType> = Array<DateType>

typealias DateRender<DateType> = (currentDate: DateType, today: DateType) -> Any /* String | ReactElement */
typealias MonthCellRender<DateType> = (currentDate: DateType, locale: Locale) -> Any /* String | ReactElement */
typealias RangeDateRender<DateType> = (currentDate: DateType, today: DateType, info: RangeInfo) -> Any /* String | ReactElement */

typealias RangeType = String /* "start" | "end" */
