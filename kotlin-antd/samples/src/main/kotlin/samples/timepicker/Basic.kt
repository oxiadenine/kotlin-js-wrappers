package samples.timepicker

import antd.timepicker.timePicker
import kotlinx.html.id
import moment.Moment
import moment.moment
import react.*
import react.dom.*

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

fun RBuilder.basic() {
    div("time-picker-container") {
        attrs.id = "time-picker-basic"
        timePicker {
            attrs {
                onChange = ::handleChange
                defaultOpenValue = moment("00:00:00", "HH:mm:ss")
            }
        }
    }
}
