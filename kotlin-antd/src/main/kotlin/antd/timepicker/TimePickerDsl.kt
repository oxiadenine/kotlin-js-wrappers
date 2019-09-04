package antd.timepicker

import react.RBuilder
import react.RHandler

fun RBuilder.timePicker(handler: RHandler<TimePickerProps>) = child(TimePickerComponent::class, handler)
