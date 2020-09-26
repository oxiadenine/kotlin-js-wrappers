package samples.timepicker

import antd.timepicker.*
import moment.*
import react.*
import styled.*

private val timeFormat = "HH:mm"

fun RBuilder.hideColumn() {
    styledDiv {
        css { +TimePickerStyles.hideColumn }
        timePicker {
            attrs {
                defaultValue = moment("12:08", timeFormat)
                format = timeFormat
            }
        }
    }
}
