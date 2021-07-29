package samples.timepicker

import antd.icon.smileOutlined
import antd.timepicker.timePicker
import moment.Moment
import moment.moment
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

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
