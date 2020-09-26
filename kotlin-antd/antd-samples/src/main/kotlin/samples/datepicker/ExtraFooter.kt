package samples.datepicker

import antd.datepicker.*
import react.*
import react.dom.*
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
