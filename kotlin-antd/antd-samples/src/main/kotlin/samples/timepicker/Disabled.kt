package samples.timepicker

import antd.timepicker.*
import moment.*
import react.*
import styled.*

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
