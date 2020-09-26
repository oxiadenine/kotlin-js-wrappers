package samples.timepicker

import antd.timepicker.*
import moment.*
import react.*
import styled.*

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
