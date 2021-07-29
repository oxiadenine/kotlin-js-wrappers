package samples.timepicker

import antd.timepicker.timePicker
import moment.moment
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.size() {
    styledDiv {
        css { +TimePickerStyles.size }
        div {
            timePicker {
                attrs {
                    defaultValue = moment("12:08:23", "HH:mm:ss")
                    size = "large"
                }
            }
            timePicker {
                attrs.defaultValue = moment("12:08:23", "HH:mm:ss")
            }
            timePicker {
                attrs {
                    defaultValue = moment("12:08:23", "HH:mm:ss")
                    size = "small"
                }
            }
        }
    }
}
