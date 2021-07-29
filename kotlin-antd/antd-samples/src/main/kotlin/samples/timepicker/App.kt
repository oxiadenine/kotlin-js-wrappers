package samples.timepicker

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TimePickerStyles : StyleSheet("time-picker", isStatic = true) {
    val container by css {}
    val basic by css {}
    val size by css {}
    val hideColumn by css {}
    val addon by css {}
    val value by css {}
    val disabled by css {}
    val intervalOptions by css {}
    val hours12 by css {}
    val suffix by css {}
}

class TimePickerApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"TimePicker" }
        styledDiv {
            css { +TimePickerStyles.container }
            basic()
            size()
            hideColumn()
            addon()
            value()
            disabled()
            intervalOptions()
            hours12()
            suffix()
        }
    }
}

fun RBuilder.timePickerApp() = child(TimePickerApp::class) {}
