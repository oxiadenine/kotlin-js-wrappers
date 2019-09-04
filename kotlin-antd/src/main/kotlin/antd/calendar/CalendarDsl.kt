package antd.calendar

import react.RBuilder
import react.RHandler

fun RBuilder.calendar(handler: RHandler<CalendarProps>) = child(CalendarComponent::class, handler)
