package samples.datepicker

import antd.datepicker.*
import antd.timepicker.*
import kotlinext.js.*
import moment.*
import react.*
import react.dom.*
import styled.*

private fun range(start: Number, end: Number): Array<Number> {
    return (start.toInt()..end.toInt()).toList().toTypedArray()
}

private fun hndleDisabledDate(current: Moment?): Boolean {
    if (current == null) {
        return false
    }

    return current.asDynamic() < moment().endOf("day").asDynamic()
}

private fun handleDisabledDateTime(current: Moment): DatePickerDisabledTime {
    return jsObject {
        disabledHours = { range(0, 24).sliceArray(4..24) }
        disabledMinutes = { range(30, 60) }
        disabledSeconds = { arrayOf(55, 56) }
    }
}

private fun handleDisabledRangeTime(current: Moment?, type: String): DatePickerDisabledTime {
    if (type == "start") {
        return jsObject {
            disabledHours = { range(0, 60).sliceArray(4..24) }
            disabledMinutes = { range(30, 60) }
            disabledSeconds = { arrayOf(55, 56) }
        }
    }

    return jsObject {
        disabledHours = { range(0, 60).sliceArray(20..24) }
        disabledMinutes = { range(0, 30) }
        disabledSeconds = { arrayOf(55, 56) }
    }
}

fun RBuilder.disabledDate() {
    styledDiv {
        css { +DatePickerStyles.disabledDate }
        div {
            datePicker {
                attrs {
                    format = "YYYY-MM-DD HH:mm:ss"
                    disabledDate = ::hndleDisabledDate
                    disabledTime = ::handleDisabledDateTime
                    showTime = jsObject<TimePickerProps> {
                        defaultValue = moment("00:00:00", "HH:mm:ss")
                    }
                }
            }
            br {}
            monthPicker {
                attrs {
                    disabledDate = ::hndleDisabledDate
                    placeholder = "Select month"
                }
            }
            br {}
            rangePicker {
                attrs {
                    disabledDate = ::hndleDisabledDate
                    disabledTime = ::handleDisabledRangeTime
                    showTime = jsObject<TimePickerProps> {
                        hideDisabledOptions = true
                        defaultValue = arrayOf(
                            moment("00:00:00", "HH:mm:ss"),
                            moment("11:59:59", "HH:mm:ss")
                        )
                    }
                    format = "YYYY-MM-DD HH:mm:ss"
                }
            }
        }
    }
}
