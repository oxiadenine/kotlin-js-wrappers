package samples.timepicker

import antd.timepicker.*
import react.*
import styled.*

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
