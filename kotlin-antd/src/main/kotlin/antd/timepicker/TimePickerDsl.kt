package antd.timepicker

import react.*

fun RBuilder.timePicker(handler: RHandler<TimePickerProps>) = child(TimePickerComponent::class, handler)
