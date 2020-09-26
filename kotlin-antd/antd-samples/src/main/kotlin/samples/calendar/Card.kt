package samples.calendar

import antd.calendar.*
import kotlinext.js.*
import moment.*
import react.*
import react.dom.*
import styled.*

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
