package samples.timepicker

import antd.timepicker.timePicker
import kotlinx.html.id
import moment.moment
import react.*
import react.dom.*

fun RBuilder.size() {
    div("time-picker-container") {
        attrs.id = "time-picker-size"
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
