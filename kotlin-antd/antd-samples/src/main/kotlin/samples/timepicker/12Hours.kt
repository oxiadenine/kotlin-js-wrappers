package samples.timepicker

import antd.timepicker.*
import moment.*
import react.*
import react.dom.*
import styled.*

private fun handleChange(time: Moment, timeString: String) {
    console.log(time, timeString)
}

fun RBuilder.hours12() {
    styledDiv {
        css { +TimePickerStyles.hours12 }
        div {
            timePicker {
                attrs {
                    use12Hours = true
                    onChange = ::handleChange
                }
            }
            timePicker {
                attrs {
                    use12Hours = true
                    format = "h:mm:ss A"
                    onChange = ::handleChange
                }
            }
            timePicker {
                attrs {
                    use12Hours = true
                    format = "h:mm a"
                    onChange = ::handleChange
                }
            }
        }
    }
}
