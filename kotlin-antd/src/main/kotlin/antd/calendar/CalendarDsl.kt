package antd.calendar

import moment.Moment
import react.*

fun RBuilder.calendar(handler: RHandler<CalendarProps<Moment>>) = child(CalendarComponent::class, handler)
