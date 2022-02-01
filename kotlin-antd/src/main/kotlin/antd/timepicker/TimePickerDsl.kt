package antd.timepicker

import kotlinext.js.jso
import react.*

fun RBuilder.timePicker(handler: RHandler<TimePickerProps>) = child(TimePickerComponent::class, handler)
fun RBuilder.rangePicker(handler: RHandler<RangeTimePickerProps>) = child(TimePickerComponent.RangePicker, jso {}, handler)
