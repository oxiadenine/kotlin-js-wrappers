package samples.datepicker

import antd.datepicker.*
import moment.*
import react.*
import react.dom.*
import styled.*

private fun handleChange(date: Moment, dateString: String) {
    console.log(date, dateString)
}

private fun handleRangeChange(dates: Array<Moment>, dateStrings: Array<String>) {
    console.log(dates, dateStrings)
}

fun RBuilder.basic() {
    styledDiv {
        css { +DatePickerStyles.basic }
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
