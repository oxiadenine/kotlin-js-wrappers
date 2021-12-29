package antd.datepicker

import moment.Moment
import react.*

external interface WeekPickerComponent : ComponentClass<WeekPickerProps>

external interface WeekPickerProps : PickerDateProps<Moment>, Props