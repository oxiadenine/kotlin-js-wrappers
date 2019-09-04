package samples.datepicker

import antd.datepicker.*
import antd.icon.icon
import kotlinx.html.id
import moment.Moment
import react.*
import react.dom.*

private val smileIcon = buildElement {
    icon {
        attrs.type = "smile"
    }
}

private fun handleChange(date: Moment, dateString: String) {
    console.log(date, dateString)
}

private fun handleRangeChange(dates: RangePickerValue, dateStrings: Array<String>) {
    console.log(dates, dateStrings)
}

fun RBuilder.suffix() {
    div("date-picker-container") {
        attrs.id = "date-picker-suffix"
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
