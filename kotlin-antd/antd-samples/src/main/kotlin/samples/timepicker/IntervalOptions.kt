package samples.timepicker

import antd.timepicker.timePicker
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.intervalOptions() {
    styledDiv {
        css { +TimePickerStyles.intervalOptions }
        timePicker {
            attrs {
                minuteStep = 15
                secondStep = 10
            }
        }
    }
}
