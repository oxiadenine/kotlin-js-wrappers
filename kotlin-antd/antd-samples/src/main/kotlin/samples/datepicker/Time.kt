package samples.datepicker

import antd.datepicker.*
import antd.timepicker.*
import kotlinext.js.*
import moment.*
import react.*
import react.dom.*
import styled.*

private fun handleChange(date: Moment, dateString: String) {
    console.log("Selected Time: ", date)
    console.log("Formatted Selected Time: ", dateString)
}

private fun handleRangeChange(dates: RangePickerValue, dateStrings: Array<String>) {
    console.log(dates, dateStrings)
}

private fun handleOk(selectedTime: RangePickerPresetRange) {
    console.log("onOk: ", selectedTime)
}

fun RBuilder.time() {
    styledDiv {
        css { +DatePickerStyles.time }
        div {
            datePicker {
                attrs {
                    showTime = true
                    placeholder = "Select Time"
                    onChange = ::handleChange
                    onOk = ::handleOk
                }
            }
            br {}
            rangePicker {
                attrs {
                    showTime = jsObject<TimePickerProps> {
                        defaultValue = "HH:mm"
                    }
                    format = "YYYY-MM-DD HH:mm"
                    placeholder = arrayOf("Start Time", "End Time")
                    onChange = ::handleRangeChange
                    onOk = ::handleOk
                }
            }
        }
    }
}
