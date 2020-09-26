package samples.calendar

import antd.calendar.*
import moment.*
import react.*
import styled.*

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
