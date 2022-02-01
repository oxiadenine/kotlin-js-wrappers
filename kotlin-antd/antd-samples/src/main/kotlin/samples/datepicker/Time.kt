package samples.datepicker

import antd.datepicker.RangeShowTimeObject
import antd.datepicker.RangeValue
import antd.datepicker.datePicker
import antd.datepicker.rangePicker
import kotlinext.js.jso
import moment.Moment
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private fun handleChange(date: Moment, dateString: String) {
    console.log("Selected Time: ", date)
    console.log("Formatted Selected Time: ", dateString)
}

private fun handleRangeChange(dates: RangeValue<Moment>, dateStrings: Array<String>) {
    console.log(dates, dateStrings)
}

private fun handleOk(selectedTime: RangeValue<Moment>) {
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
                    showTime = jso<RangeShowTimeObject<Moment>> {
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
