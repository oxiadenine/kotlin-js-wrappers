package samples.timepicker

import antd.icon.icon
import antd.timepicker.timePicker
import moment.Moment
import moment.moment
import react.*
import styled.css
import styled.styledDiv

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

private val icon = buildElement {
    icon {
        attrs.type = "smile"
    }
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
