package antd.datepicker

import moment.Moment
import react.*

external interface TimePickerComponent : ComponentClass<TimePickerProps>

external interface TimePickerProps : PickerTimeProps<Moment>, Props
