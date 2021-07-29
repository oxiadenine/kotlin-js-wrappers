package antd.datepicker

import moment.Moment
import react.*

external interface TimePickerComponent : ComponentType<TimePickerProps>

external interface TimePickerProps : PickerTimeProps<Moment>, RProps
