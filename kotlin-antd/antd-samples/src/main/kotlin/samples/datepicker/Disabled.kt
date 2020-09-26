package samples.datepicker

import antd.datepicker.*
import moment.moment
import react.*
import react.dom.*
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
