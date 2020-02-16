package samples.calendar

import react.*
import react.dom.*

class CalendarApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Calendar" }
        div {
            basic()
            noticeCalendar()
            card()
            select()
            customizeHeader()
        }
    }
}

fun RBuilder.calendarApp() = child(CalendarApp::class) {}
