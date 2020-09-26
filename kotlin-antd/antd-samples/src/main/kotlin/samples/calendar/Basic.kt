package samples.calendar

import antd.calendar.CalendarMode
import antd.calendar.calendar
import moment.Moment
import react.RBuilder
import styled.css
import styled.styledDiv

private fun handlePanelChange(value: Moment?, mode: CalendarMode?) {
    console.log(value, mode)
}

fun RBuilder.basic() {
    styledDiv {
        css { +CalendarStyles.basic }
        calendar {
            attrs.onPanelChange = ::handlePanelChange
        }
    }
}
