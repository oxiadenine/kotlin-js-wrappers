package samples.datepicker

import antd.datepicker.datePicker
import moment.Moment
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface DateRangeState : State {
    var startValue: Moment?
    var endValue: Moment?
    var endOpen: Boolean
}

class DateRange : RComponent<Props, DateRangeState>() {
    private val handleDisabledStartDate = fun(current: Moment?): Boolean {
        val endValue = state.endValue

        if (current == null || endValue == null) {
            return false
        }

        return current.valueOf().asDynamic() > endValue.valueOf().asDynamic()
    }

    private val handleDisabledEndDate = fun(current: Moment?): Boolean {
        val startValue = state.startValue

        if (current == null || startValue == null) {
            return false
        }

        return current.valueOf().asDynamic() <= startValue.valueOf().asDynamic()
    }

    private val handleStartChange = fun(date: Moment, _: String) {
        setState {
            startValue = date
        }
    }

    private val handleEndChange = fun(date: Moment, _: String) {
        setState {
            endValue = date
        }
    }

    private val handleStartOpenChange = fun(status: Boolean) {
        if (!status) {
            setState {
                endOpen = true
            }
        }
    }

    private val handleEndOpenChange = fun(status: Boolean) {
        setState {
            endOpen = status
        }
    }

    override fun DateRangeState.init() {
        startValue = null
        endValue = null
        endOpen = false
    }

    override fun RBuilder.render() {
        div {
            datePicker {
                attrs {
                    disabledDate = handleDisabledStartDate
                    showTime = true
                    format = "YYYY-MM-DD HH:mm:ss"
                    value = state.startValue
                    placeholder = "Start"
                    onChange = handleStartChange
                    onOpenChange = handleStartOpenChange
                }
            }
            br {}
            datePicker {
                attrs {
                    disabledDate = handleDisabledEndDate
                    showTime = true
                    format = "YYYY-MM-DD HH:mm:ss"
                    value = state.endValue
                    placeholder = "End"
                    onChange = handleEndChange
                    open = state.endOpen
                    onOpenChange = handleEndOpenChange
                }
            }
        }
    }
}

fun RBuilder.dateRange() = child(DateRange::class) {}

fun RBuilder.startEnd() {
    styledDiv {
        css { +DatePickerStyles.startEnd }
        dateRange()
    }
}
