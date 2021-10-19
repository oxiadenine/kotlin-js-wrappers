package antd.datepicker

import moment.Moment
import react.*

external interface WeekPickerComponent : ComponentType<WeekPickerProps>

external interface WeekPickerProps : PickerDateProps<Moment>, Props