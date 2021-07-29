package samples.timepicker

import antd.timepicker.timePicker
import moment.moment
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.disabled() {
    styledDiv {
        css { +TimePickerStyles.disabled }
        timePicker {
            attrs {
                defaultValue = moment("12:08:23", "HH:mm:ss")
                disabled = true
            }
        }
    }
}
