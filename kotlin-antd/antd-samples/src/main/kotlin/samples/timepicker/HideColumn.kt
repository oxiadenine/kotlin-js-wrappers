package samples.timepicker

import antd.timepicker.timePicker
import moment.moment
import react.*
import styled.css
import styled.styledDiv

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
