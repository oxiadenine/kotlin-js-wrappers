package samples.timepicker

import antd.timepicker.timePicker
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.intervalOptions() {
    div("time-picker-container") {
        attrs.id = "time-picker-interval-options"
        timePicker {
            attrs {
                minuteStep = 15
                secondStep = 10
            }
        }
    }
}
