package samples.calendar

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object CalendarStyles : StyleSheet("calendar", isStatic = true) {
    val container by css {}
    val basic by css {}
    val noticeCalendar by css {
        descendants(".events") {
            margin(0.px)
            padding(0.px)
            listStyleType = ListStyleType.none
            descendants(".ant-badge-status") {
                width = LinearDimension("100%")
                overflow = Overflow.hidden
                textOverflow = TextOverflow.ellipsis
                whiteSpace = WhiteSpace.nowrap
                fontSize = 12.px
            }
        }
        descendants(".notes-month") {
            textAlign = TextAlign.center
            fontSize = 28.px
            descendants("section") {
                fontSize = 28.px
            }
        }
    }
    val card by css {}
    val select by css {}
    val customizeHeader by css {}
}

class CalendarApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Calendar" }
        styledDiv {
            css { +CalendarStyles.container }
            basic()
            noticeCalendar()
            card()
            select()
            customizeHeader()
        }
    }
}

fun RBuilder.calendarApp() = child(CalendarApp::class) {}
