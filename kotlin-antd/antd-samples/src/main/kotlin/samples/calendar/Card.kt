package samples.calendar

import antd.calendar.*
import kotlinx.css.*
import kotlinx.css.properties.border
import moment.*
import react.*
import styled.*

private fun handlePanelChange(value: Moment?, mode: CalendarMode?) {
    console.log(value, mode)
}

fun RBuilder.card() {
    styledDiv {
        css { +CalendarStyles.card }
        styledDiv {
            css {
                width = 300.px
                border(1.px, BorderStyle.solid, Color("#d9d9d9"))
                borderRadius = 4.px
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
