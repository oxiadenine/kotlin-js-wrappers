package antd.datepicker

import kotlinext.js.*
import react.*

fun RBuilder.datePicker(handler: RHandler<DatePickerProps>) = child(DatePickerComponent::class, handler)
fun RBuilder.weekPicker(handler: RHandler<WeekPickerProps>) = child(DatePickerComponent.WeekPicker, jso {}, handler)
fun RBuilder.monthPicker(handler: RHandler<MonthPickerProps>) = child(DatePickerComponent.MonthPicker, jso {}, handler)
fun RBuilder.yearPicker(handler: RHandler<MonthPickerProps>) = child(DatePickerComponent.YearPicker, jso {}, handler)
fun RBuilder.rangePicker(handler: RHandler<RangePickerProps>) = child(DatePickerComponent.RangePicker, jso {}, handler)
fun RBuilder.timePicker(handler: RHandler<TimePickerProps>) = child(DatePickerComponent.TimePicker, jso {}, handler)
fun RBuilder.quarterPicker(handler: RHandler<QuarterPickerProps>) = child(DatePickerComponent.QuarterPicker, jso {}, handler)
