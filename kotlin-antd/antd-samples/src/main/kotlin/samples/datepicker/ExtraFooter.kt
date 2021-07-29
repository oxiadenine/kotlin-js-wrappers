package samples.datepicker

import antd.datepicker.datePicker
import antd.datepicker.monthPicker
import antd.datepicker.rangePicker
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.extraFooter() {
    styledDiv {
        css { +DatePickerStyles.extraFooter }
        div {
            datePicker {
                attrs.renderExtraFooter = { "extra footer" }
            }
            br {}
            datePicker {
                attrs {
                    renderExtraFooter = { "extra footer" }
                    showTime = true
                }
            }
            br {}
            rangePicker {
                attrs.renderExtraFooter = { "extra footer" }
            }
            br {}
            rangePicker {
                attrs {
                    renderExtraFooter = { "extra footer" }
                    showTime = true
                }
            }
            br {}
            monthPicker {
                attrs {
                    renderExtraFooter = { "extra footer" }
                    placeholder = "Select month"
                }
            }
        }
    }
}
