@file:JsModule("antd/lib/calendar")
@file:JsNonModule

package antd.calendar

import antd.localeprovider.Locale
import moment.*
import react.*

@JsName("default")
external object CalendarComponent : Component<CalendarProps<Moment>, CalendarState> {
    override fun render(): ReactElement?
}

external interface CalendarProps<DateType> : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var locale: Locale?
    var validRange: Array<DateType>?
    var disabledDate: ((date: DateType) -> Boolean)?
    var dateFullCellRender: ((date: DateType) -> Any /* String | ReactElement */)?
    var dateCellRender: ((date: DateType) -> Any /* String | ReactElement */)?
    var monthFullCellRender: ((date: DateType) -> Any /* String | ReactElement */)?
    var monthCellRender: ((date: DateType) -> Any /* String | ReactElement */)?
    var headerRender: HeaderRender<DateType>?
    var value: DateType?
    var defaultValue: DateType?
    var mode: CalendarMode?
    var fullscreen: Boolean?
    var onChange: ((date: DateType) -> Unit)?
    var onPanelChange: ((date: DateType, mode: CalendarMode) -> Unit)?
    var onSelect: ((date: DateType) -> Unit)?
}

external interface CalendarState : RState {
    var value: Moment
    var mode: CalendarMode?
}

external interface GenerateConfig<DateType> {
    var getWeekDay: (value: DateType) -> Number
    var getSecond: (value: DateType) -> Number
    var getMinute: (value: DateType) -> Number
    var getHour: (value: DateType) -> Number
    var getDate: (value: DateType) -> Number
    var getMonth: (value: DateType) -> Number
    var getYear: (value: DateType) -> Number
    var getNow: () -> DateType
    var getFixedDate: (fixed: String) -> DateType
    var getEndDate: (value: DateType) -> DateType
    var addYear: (value: DateType, diff: Number) -> DateType
    var addMonth: (value: DateType, diff: Number) -> DateType
    var addDate: (value: DateType, diff: Number) -> DateType
    var setYear: (value: DateType, year: Number) -> DateType
    var setMonth: (value: DateType, month: Number) -> DateType
    var setDate: (value: DateType, date: Number) -> DateType
    var setHour: (value: DateType, hour: Number) -> DateType
    var setMinute: (value: DateType, minute: Number) -> DateType
    var setSecond: (value: DateType, second: Number) -> DateType
    var isAfter: (date1: DateType, date2: DateType) -> Boolean
    var isValidate: (date: DateType) -> Boolean
    var locale: GenerateConfigLocale<DateType>
}

external interface GenerateConfigLocale<DateType> {
    var getWeekFirstDay: (locale: String) -> Number
    var getWeekFirstDate: (locale: String, value: DateType) -> DateType
    var getWeek: (locale: String, value: DateType) -> Number
    var format: (locale: String, date: DateType, format: String) -> String
    var parse: (locale: String, text: String, formats: Array<String>) -> DateType?
    var getShortWeekDays: ((locale: String) -> Array<String>)?
    var getShortMonths: ((locale: String) -> Array<String>)?
}

external interface HeaderRenderConfig<DateType> {
    var value: DateType
    var type: CalendarMode
    var onChange: (date: DateType) -> Unit
    var onTypeChange: (type: CalendarMode) -> Unit
}

external interface Locale {
    var locale: String
    var monthBeforeYear: Boolean?
    var yearFormat: String
    var monthFormat: String?
    var quarterFormat: String?
    var today: String
    var now: String
    var backToToday: String
    var ok: String
    var timeSelect: String
    var dateSelect: String
    var weekSelect: String?
    var clear: String
    var month: String
    var year: String
    var previousMonth: String
    var nextMonth: String
    var monthSelect: String
    var yearSelect: String
    var decadeSelect: String
    var dayFormat: String
    var dateFormat: String
    var dateTimeFormat: String
    var previousYear: String
    var nextYear: String
    var previousDecade: String
    var nextDecade: String
    var previousCentury: String
    var nextCentury: String
    var shortWeekDays: Array<String>?
    var shortMonths: Array<String>?
}
