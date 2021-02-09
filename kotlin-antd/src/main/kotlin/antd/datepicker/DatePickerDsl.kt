package antd.datepicker

import kotlinext.js.*
import react.*

fun RBuilder.datePicker(handler: RHandler<DatePickerProps>) = child(DatePickerComponent::class, handler)
fun RBuilder.weekPicker(handler: RHandler<WeekPickerProps>) = child(DatePickerComponent.WeekPicker, jsObject {}, handler)
fun RBuilder.monthPicker(handler: RHandler<MonthPickerProps>) = child(DatePickerComponent.MonthPicker, jsObject {}, handler)
fun RBuilder.yearPicker(handler: RHandler<MonthPickerProps>) = child(DatePickerComponent.YearPicker, jsObject {}, handler)
fun RBuilder.rangePicker(handler: RHandler<RangePickerProps>) = child(DatePickerComponent.RangePicker, jsObject {}, handler)
fun RBuilder.timePicker(handler: RHandler<TimePickerProps>) = child(DatePickerComponent.TimePicker, jsObject {}, handler)
fun RBuilder.quarterPicker(handler: RHandler<QuarterPickerProps>) = child(DatePickerComponent.QuarterPicker, jsObject {}, handler)
