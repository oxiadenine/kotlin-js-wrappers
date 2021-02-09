package samples.datepicker

import antd.datepicker.*
import kotlinext.js.*
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
                    val style = js {}

                    if (current.date() == 1) {
                        style.border = "1px solid #1890ff"
                        style.borderRadius = "50%"
                    }

                    div {
                        attrs {
                            classes = setOf("ant-calendar-date")
                            jsStyle = style
                        }
                        +"${current.date()}"
                    }
                }
            }
            br {}
            rangePicker {
                attrs.dateRender = { current: Moment ->
                    val style = js {}

                    if (current.date() == 1) {
                        style.border = "1px solid #1890ff"
                        style.borderRadius = "50%"
                    }

                    div {
                        attrs {
                            classes = setOf("ant-calendar-date")
                            jsStyle = style
                        }
                        +"${current.date()}"
                    }
                }
            }
        }
    }
}
