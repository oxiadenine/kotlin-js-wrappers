package samples.datepicker

import antd.datepicker.*
import kotlinx.html.id
import moment.moment
import react.*
import react.dom.*

private val dateformat = "YYYY-MM-DD"

fun RBuilder.disabled() {
    div("date-picker-container") {
        attrs.id = "date-picker-disabled"
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
