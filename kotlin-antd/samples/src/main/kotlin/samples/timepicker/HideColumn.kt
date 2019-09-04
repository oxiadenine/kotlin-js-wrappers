package samples.timepicker

import antd.timepicker.timePicker
import kotlinx.html.id
import moment.moment
import react.*
import react.dom.*

private val timeFormat = "HH:mm"

fun RBuilder.hideColumn() {
    div("time-picker-container") {
        attrs.id = "time-picker-hide-column"
        timePicker {
            attrs {
                defaultValue = moment("12:08", timeFormat)
                format = timeFormat
            }
        }
    }
}
