package samples.datepicker

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object DatePickerStyles : StyleSheet("date-picker", isStatic = true) {
    val container by css {}
    val basic by css {}
    val size by css {}
    val disabled by css {}
    val startEnd by css {}
    val extraFooter by css {}
    val dateRender by css {}
    val format by css {}
    val time by css {}
    val disabledDate by css {}
    val presettedRanges by css {}
    val mode by css {}
    val suffix by css {}
}

class DatePickerApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"DatePicker" }
        styledDiv {
            css { +DatePickerStyles.container }
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
