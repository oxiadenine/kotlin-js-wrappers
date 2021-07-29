package samples.datepicker

import antd.datepicker.datePicker
import antd.datepicker.rangePicker
import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.html.classes
import moment.Moment
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

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
