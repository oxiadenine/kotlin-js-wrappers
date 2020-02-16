package samples.datepicker

import antd.datepicker.*
import kotlinx.html.id
import moment.Moment
import react.*
import react.dom.*

private fun handleChange(date: Moment, dateString: String) {
    console.log(date, dateString)
}

private fun handleRangeChange(dates: RangePickerValue, dateStrings: Array<String>) {
    console.log(dates, dateStrings)
}

fun RBuilder.basic() {
    div("date-picker-container") {
        attrs.id = "date-picker-basic"
        div {
            datePicker {
                attrs.onChange = ::handleChange
            }
            br {}
            monthPicker {
                attrs {
                    onChange = ::handleChange
                    placeholder = "Select month"
                }
            }
            br {}
            rangePicker {
                attrs {
                    onChange = ::handleRangeChange
                }
            }
            br {}
            weekPicker {
                attrs {
                    onChange = ::handleChange
                    placeholder = "Select week"
                }
            }
        }
    }
}
