package samples.calendar

import antd.alert.alert
import antd.calendar.CalendarMode
import antd.calendar.calendar
import moment.Moment
import moment.moment
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface SelectAppState : State {
    var value: Moment
    var selectedValue: Moment
}

class SelectApp : RComponent<RProps, SelectAppState>() {
    private val handleSelect = fun(date: Moment?) {
        setState {
            value = date!!
            selectedValue = date
        }
    }

    private val handlePanelChange = fun(date: Moment?, _: CalendarMode?) {
        setState {
            value = date!!
        }
    }

    override fun SelectAppState.init() {
        value = moment("2017-01-25")
        selectedValue = moment("2017-01-25")
    }

    override fun RBuilder.render() {
        div {
            alert {
                attrs.message = "You selected date: ${state.selectedValue.format("YYYY-MM-DD")}"
            }
            calendar {
                attrs {
                    value = state.value
                    onSelect = handleSelect
                    onPanelChange = handlePanelChange
                }
            }
        }
    }
}

fun RBuilder.selectApp() = child(SelectApp::class) {}

fun RBuilder.select() {
    styledDiv {
        css { +CalendarStyles.select }
        selectApp()
    }
}
