package samples.timepicker

import react.*
import react.dom.*

class TimePickerApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"TimePicker" }
        div {
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
