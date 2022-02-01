package samples.datepicker

import antd.datepicker.*
import kotlinext.js.jso
import moment.Moment
import moment.moment
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private fun range(start: Number, end: Number): Array<Number> {
    return (start.toInt()..end.toInt()).toList().toTypedArray()
}

private fun handleDisabledDate(current: Moment?): Boolean {
    if (current == null) {
        return false
    }

    return current.asDynamic() < moment().endOf("day").asDynamic()
}

private val handleDisabledDateTime = { _: Moment ->
    jso<DisabledTimes> {
        disabledHours = { range(0, 24).sliceArray(4..24) }
        disabledMinutes = { range(30, 60) }
        disabledSeconds = { _, _ -> arrayOf(55, 56) }
    }
}

private val handleDisabledRangeTime = { _: Moment?, type: String ->
    if (type == "start") {
        jso<DisabledTimes> {
            disabledHours = { range(0, 60).sliceArray(4..24) }
            disabledMinutes = { range(30, 60) }
            disabledSeconds = { _, _ -> arrayOf(55, 56) }
        }
    }

    jso<DisabledTimes> {
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
                    disabledTime = handleDisabledDateTime
                    showTime = jso<SharedTimeProps<Moment>> {
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
                    disabledTime = handleDisabledRangeTime
                    showTime = jso<RangeShowTimeObject<Moment>> {
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
