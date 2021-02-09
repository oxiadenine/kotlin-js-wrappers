package samples.datepicker

import antd.datepicker.*
import kotlinext.js.*
import moment.*
import react.*
import react.dom.*
import styled.*

private fun range(start: Number, end: Number): Array<Number> {
    return (start.toInt()..end.toInt()).toList().toTypedArray()
}

private fun handleDisabledDate(current: Moment?): Boolean {
    if (current == null) {
        return false
    }

    return current.asDynamic() < moment().endOf("day").asDynamic()
}

private fun handleDisabledDateTime(current: Moment): DisabledTimes {
    return jsObject {
        disabledHours = { range(0, 24).sliceArray(4..24) }
        disabledMinutes = { range(30, 60) }
        disabledSeconds = { _, _ -> arrayOf(55, 56) }
    }
}

private fun handleDisabledRangeTime(current: Moment?, type: String): DisabledTimes {
    if (type == "start") {
        return jsObject {
            disabledHours = { range(0, 60).sliceArray(4..24) }
            disabledMinutes = { range(30, 60) }
            disabledSeconds = { _, _ -> arrayOf(55, 56) }
        }
    }

    return jsObject {
        disabledHours = { range(0, 60).sliceArray(20..24) }
        disabledMinutes = { range(0, 30) }
        disabledSeconds = { _, _ -> arrayOf(55, 56) }
    }
}

fun RBuilder.disabledDate() {
    styledDiv {
        css { +DatePickerStyles.disabledDate }
        div {
            datePicker {
                attrs {
                    format = "YYYY-MM-DD HH:mm:ss"
                    disabledDate = ::handleDisabledDate
                    disabledTime = ::handleDisabledDateTime
                    showTime = jsObject<SharedTimeProps<Moment>> {
                        defaultValue = moment("00:00:00", "HH:mm:ss")
                    }
                }
            }
            br {}
            monthPicker {
                attrs {
                    disabledDate = ::handleDisabledDate
                    placeholder = "Select month"
                }
            }
            br {}
            rangePicker {
                attrs {
                    disabledDate = ::handleDisabledDate
                    disabledTime = ::handleDisabledRangeTime
                    showTime = jsObject<RangeShowTimeObject<Moment>> {
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
