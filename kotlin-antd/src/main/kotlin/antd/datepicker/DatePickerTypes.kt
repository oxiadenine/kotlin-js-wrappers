package antd.datepicker

import antd.ReactNode

typealias AlignPoint = String

typealias PanelMode = String /* "time" | "date" | "week" | "month" | "quarter" | "year" | "decade" */

typealias DisabledTime<DateType> = (date: DateType?) -> DisabledTimes
typealias OnPanelChange<DateType> = (value: DateType, mode: PanelMode) -> Unit
typealias RangeValue<DateType> = Array<DateType>

typealias DateRender<DateType> = (currentDate: DateType, today: DateType) -> ReactNode
typealias MonthCellRender<DateType> = (currentDate: DateType, locale: Locale) -> ReactNode
typealias RangeDateRender<DateType> = (currentDate: DateType, today: DateType, info: RangeInfo) -> ReactNode

typealias RangeType = String /* "start" | "end" */
