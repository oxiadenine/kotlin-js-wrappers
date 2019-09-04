package samples.timepicker

import antd.icon.icon
import antd.timepicker.timePicker
import kotlinx.html.id
import moment.Moment
import moment.moment
import react.*
import react.dom.*

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

private val icon = buildElement {
    icon {
        attrs.type = "smile"
    }
}

fun RBuilder.suffix() {
    div("time-picker-container") {
        attrs.id = "time-picker-suffix"
        timePicker {
            attrs {
                suffixIcon = icon
                onChange = ::handleChange
                defaultOpenValue = moment("00:00:00", "HH:mm:ss")
            }
        }
    }
}
