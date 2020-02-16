package samples.datepicker

import react.*
import react.dom.*

class DatePickerApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"DatePicker" }
        div {
            basic()
            size()
            disabled()
            startEnd()
            extraFooter()
            dateRender()
            format()
            time()
            disabledDate()
            presettedRanges()
            mode()
            suffix()
        }
    }
}

fun RBuilder.datePickerApp() = child(DatePickerApp::class) {}
