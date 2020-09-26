package samples.calendar

import antd.calendar.CalendarMode
import antd.calendar.calendar
import kotlinext.js.js
import moment.Moment
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import styled.css
import styled.styledDiv

private fun handlePanelChange(value: Moment?, mode: CalendarMode?) {
    console.log(value, mode)
}

fun RBuilder.card() {
    styledDiv {
        css { +CalendarStyles.card }
        div {
            attrs.jsStyle = js {
                width = 300
                border = "1px solid #d9d9d9"
                borderRadius = 4
            }
            calendar {
                attrs {
                    fullscreen = false
                    onPanelChange = ::handlePanelChange
                }
            }
        }
    }
}
