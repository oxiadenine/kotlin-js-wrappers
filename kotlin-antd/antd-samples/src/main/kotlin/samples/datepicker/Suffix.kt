package samples.datepicker

import antd.datepicker.*
import antd.icon.smileOutlined
import moment.Moment
import react.RBuilder
import react.buildElement
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private val smileIcon = buildElement {
    smileOutlined {}
}

private fun handleChange(date: Moment, dateString: String) {
    console.log(date, dateString)
}

private fun handleRangeChange(dates: RangeValue<Moment>, dateStrings: Array<String>) {
    console.log(dates, dateStrings)
}

fun RBuilder.suffix() {
    styledDiv {
        css { +DatePickerStyles.suffix }
        div {
            datePicker {
                attrs {
                    suffixIcon = smileIcon
                    onChange = ::handleChange
                }
            }
            br {}
            monthPicker {
                attrs {
                    suffixIcon = smileIcon
                    onChange = ::handleChange
                    placeholder = "Select month"
                }
            }
            br {}
            rangePicker {
                attrs {
                    suffixIcon = smileIcon
                    onChange = ::handleRangeChange
                }
            }
            br {}
            weekPicker {
                attrs {
                    suffixIcon = smileIcon
                    onChange = ::handleChange
                    placeholder = "Select week"
                }
            }
            br {}
            datePicker {
                attrs {
                    suffixIcon = "ab"
                    onChange = ::handleChange
                }
            }
            br {}
            monthPicker {
                attrs {
                    suffixIcon = "ab"
                    onChange = ::handleChange
                    placeholder = "Select month"
                }
            }
            br {}
            rangePicker {
                attrs {
                    suffixIcon = "ab"
                    onChange = ::handleRangeChange
                }
            }
            br {}
            weekPicker {
                attrs {
                    suffixIcon = "ab"
                    onChange = ::handleChange
                    placeholder = "Select week"
                }
            }
        }
    }
}
