package samples.timepicker

import antd.timepicker.timePicker
import kotlinx.html.id
import moment.moment
import react.*
import react.dom.*

fun RBuilder.disabled() {
    div("time-picker-container") {
        attrs.id = "time-picker-disabled"
        timePicker {
            attrs {
                defaultValue = moment("12:08:23", "HH:mm:ss")
                disabled = true
            }
        }
    }
}
