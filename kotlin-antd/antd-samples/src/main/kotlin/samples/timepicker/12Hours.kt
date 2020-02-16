package samples.timepicker

import antd.timepicker.timePicker
import kotlinx.html.id
import moment.Moment
import react.*
import react.dom.*

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

fun RBuilder.hours12() {
    div("time-picker-container") {
        attrs.id = "time-picker-12-hours"
        div {
            timePicker {
                attrs {
                    use12Hours = true
                    onChange = ::handleChange
                }
            }
            timePicker {
                attrs {
                    use12Hours = true
                    format = "h:mm:ss A"
                    onChange = ::handleChange
                }
            }
            timePicker {
                attrs {
                    use12Hours = true
                    format = "h:mm a"
                    onChange = ::handleChange
                }
            }
        }
    }
}
