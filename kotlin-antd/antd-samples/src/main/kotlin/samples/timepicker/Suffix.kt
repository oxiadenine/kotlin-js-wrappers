package samples.timepicker

import antd.icon.*
import antd.timepicker.*
import moment.*
import react.*
import styled.*

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

private val icon = buildElement {
    smileOutlined {}
}

fun RBuilder.suffix() {
    styledDiv {
        css { +TimePickerStyles.suffix }
        timePicker {
            attrs {
                suffixIcon = icon
                onChange = ::handleChange
                defaultOpenValue = moment("00:00:00", "HH:mm:ss")
            }
        }
    }
}
