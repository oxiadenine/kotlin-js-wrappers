package samples.datepicker

import antd.datepicker.datePicker
import antd.datepicker.monthPicker
import antd.datepicker.rangePicker
import antd.datepicker.weekPicker
import moment.Moment
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

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
