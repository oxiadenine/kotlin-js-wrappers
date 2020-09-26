package antd.calendar

import react.*

fun RBuilder.calendar(handler: RHandler<CalendarProps>) = child(CalendarComponent::class, handler)
