package samples.calendar

import antd.calendar.CalendarMode
import antd.calendar.calendar
import kotlinx.html.id
import moment.Moment
import react.RBuilder
import react.dom.div

private fun handlePanelChange(value: Moment?, mode: CalendarMode?) {
    console.log(value, mode)
}

fun RBuilder.basic() {
    div("calendar-container") {
        attrs.id = "calendar-basic"
        calendar {
            attrs.onPanelChange = ::handlePanelChange
        }
    }
}
