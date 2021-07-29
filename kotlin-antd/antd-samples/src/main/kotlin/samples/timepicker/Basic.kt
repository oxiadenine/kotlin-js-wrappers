package samples.timepicker

import antd.timepicker.timePicker
import moment.Moment
import moment.moment
import react.RBuilder
import styled.css
import styled.styledDiv

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

fun RBuilder.basic() {
    styledDiv {
        css { +TimePickerStyles.basic }
        timePicker {
            attrs {
                onChange = ::handleChange
                defaultOpenValue = moment("00:00:00", "HH:mm:ss")
            }
        }
    }
}
