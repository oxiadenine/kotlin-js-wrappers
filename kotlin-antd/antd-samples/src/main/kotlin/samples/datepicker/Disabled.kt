package samples.datepicker

import antd.datepicker.datePicker
import antd.datepicker.monthPicker
import antd.datepicker.rangePicker
import moment.moment
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private val dateformat = "YYYY-MM-DD"

fun RBuilder.disabled() {
    styledDiv {
        css { +DatePickerStyles.disabled }
        div {
            datePicker {
                attrs {
                    defaultValue = moment("2015-06-06", dateformat)
                    disabled = true
                }
            }
            br {}
            monthPicker {
                attrs {
                    defaultValue = moment("2015-06", "YYYY-MM")
                    disabled = true
                }
            }
            br {}
            rangePicker {
                attrs {
                    defaultValue = arrayOf(
                        moment("2015-06-06", dateformat),
                        moment("2015-06-06", dateformat)
                    )
                    disabled = true
                }
            }
        }
    }
}
