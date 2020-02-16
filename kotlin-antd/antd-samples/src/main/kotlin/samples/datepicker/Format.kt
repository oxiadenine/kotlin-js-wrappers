package samples.datepicker

import antd.datepicker.*
import kotlinx.html.id
import moment.moment
import react.*
import react.dom.*

private val dateFormat = "YYYY/MM/DD"
private val monthFormat = "YYYY/MM"

private val dateFormatList = arrayOf("DD/MM/YYYY", "DD/MM/YY")

fun RBuilder.format() {
    div("date-picker-container") {
        attrs.id = "date-picker-format"
        div {
            datePicker {
                attrs {
                    defaultValue = moment("2015/01/01", dateFormat)
                    format = dateFormat
                }
            }
            br {}
            datePicker {
                attrs {
                    defaultValue = moment("01/01/2015", dateFormatList[0])
                    format = dateFormat
                }
            }
            br {}
            monthPicker {
                attrs {
                    defaultValue = moment("2015/01", monthFormat)
                    format = monthFormat
                }
            }
            br {}
            rangePicker {
                attrs {
                    defaultValue = arrayOf(
                            moment("2015/01/01", dateFormat),
                            moment("2015/01/01", dateFormat)
                    )
                    format = dateFormat
                }
            }
        }
    }
}
