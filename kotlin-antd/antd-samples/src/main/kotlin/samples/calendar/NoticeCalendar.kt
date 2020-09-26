package samples.calendar

import antd.badge.badge
import antd.calendar.calendar
import kotlinext.js.js
import kotlinx.html.classes
import moment.Moment
import react.RBuilder
import react.ReactElement
import react.buildElement
import react.dom.*
import styled.css
import styled.styledDiv

private fun getListData(value: Moment): Array<Any> {
    return when (value.date()) {
        8 -> arrayOf(
            js {
                type = "warning"
                content = "This is warning event."
            },
            js {
                type = "success"
                content = "This is usual event."
            }
        ).unsafeCast<Array<Any>>()
        10 -> arrayOf(
                js {
                    type = "warning"
                    content = "This is warning event."
                },
                js {
                    type = "success"
                    content = "This is usual event."
                },
                js {
                    type = "error"
                    content = "This is error event."
                }
        ).unsafeCast<Array<Any>>()
        15 ->  arrayOf(
                js {
                    type = "warning"
                    content = "This is warning event."
                },
                js {
                    type = "success"
                    content = "This is very long usual event。。...."
                },
                js {
                    type = "error"
                    content = "This is error event 1."
                },
                js {
                    type = "error"
                    content = "This is error event 2."
                },
                js {
                    type = "error"
                    content = "This is error event 3."
                },
                js {
                    type = "error"
                    content = "This is error event 4."
                }
        ).unsafeCast<Array<Any>>()
        else -> emptyArray()
    }
}

private fun dateCellRender(value: Moment): ReactElement {
    val listData = getListData(value)

    return buildElement {
        ul {
            attrs.classes = setOf("events")
            listData.map { item ->
                li {
                    attrs.key = item.asDynamic().content.unsafeCast<String>()
                    badge {
                        attrs {
                            status = item.asDynamic().type.unsafeCast<String>()
                            text = item.asDynamic().content.unsafeCast<String>()
                        }
                    }
                }
            }.toTypedArray()
        }
    }
}

private fun getMonthData(value: Moment): Number? {
    if (value.month() == 8) {
        return 1394
    }

    return null
}

private fun monthCellRender(value: Moment): ReactElement {
    val num = getMonthData(value)

    return if (num != null) {
        buildElement {
            div {
                attrs.classes = setOf("notes-month")
                section { +"$num" }
                span { +"Backlog number" }
            }
        }
    } else buildElement {}
}

fun RBuilder.noticeCalendar() {
    styledDiv {
        css { +CalendarStyles.noticeCalendar }
        calendar {
            attrs {
                dateCellRender = ::dateCellRender
                monthCellRender = ::monthCellRender
            }
        }
    }
}
