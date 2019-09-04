package samples.datepicker

import antd.datepicker.*
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.extraFooter() {
    div("date-picker-container") {
        attrs.id = "date-picker-extra-footer"
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
