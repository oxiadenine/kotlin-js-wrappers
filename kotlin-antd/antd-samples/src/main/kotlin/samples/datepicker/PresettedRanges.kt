package samples.datepicker

import antd.datepicker.RangeValue
import antd.datepicker.rangePicker
import kotlinext.js.jsObject
import moment.Moment
import moment.moment
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private fun handleChange(dates: RangeValue<Moment>, dateStrings: Array<String>) {
    console.log("From: ", (dates.unsafeCast<Array<Moment>>())[0], ", to: ", (dates.unsafeCast<Array<Moment>>())[1])
    console.log("From: ", dateStrings[0], ", to: ", dateStrings[1])
}

fun RBuilder.presettedRanges() {
    styledDiv {
        css { +DatePickerStyles.presettedRanges }
        div {
            rangePicker {
                attrs {
                    ranges = jsObject {
                        arrayOf(moment(), moment())
                        arrayOf(moment(), moment(), moment().endOf("month"))
                    }
                    onChange = ::handleChange
                }
            }
            br {}
            rangePicker {
                attrs {
                    ranges = jsObject {
                        arrayOf(moment(), moment())
                        arrayOf(moment(), moment(), moment().endOf("month"))
                    }
                    showTime = true
                    format = "YYYY/MM/DD HH:mm:ss"
                    onChange = ::handleChange
                }
            }
        }
    }
}
