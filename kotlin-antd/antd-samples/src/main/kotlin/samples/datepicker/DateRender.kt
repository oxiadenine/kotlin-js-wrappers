package samples.datepicker

import antd.datepicker.*
import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.html.*
import moment.Moment
import react.*
import react.dom.*
import styled.*

fun RBuilder.dateRender() {
    styledDiv {
        css { +DatePickerStyles.dateRender }
        div {
            datePicker {
                attrs.dateRender = { current: Moment ->
                    styledDiv {
                        if (current.date() == 1) {
                            css {
                                border(1.px, BorderStyle.solid, Color("#1890ff"))
                                borderRadius = LinearDimension("50%")
                            }
                        }
                        attrs.classes = setOf("ant-calendar-date")
                        +"${current.date()}"
                    }
                }
            }
            br {}
            rangePicker {
                attrs.dateRender = { current: Moment ->
                    styledDiv {
                        if (current.date() == 1) {
                            css {
                                border(1.px, BorderStyle.solid, Color("#1890ff"))
                                borderRadius = LinearDimension("50%")
                            }
                        }
                        attrs.classes = setOf("ant-calendar-date")
                        +"${current.date()}"
                    }
                }
            }
        }
    }
}
