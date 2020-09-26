package samples.timepicker

import antd.timepicker.*
import moment.*
import react.*
import react.dom.*
import styled.*

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
