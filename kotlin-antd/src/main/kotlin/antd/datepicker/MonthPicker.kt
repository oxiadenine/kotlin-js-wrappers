package antd.datepicker

import moment.Moment
import react.*

external interface MonthPickerComponent : ComponentClass<MonthPickerProps>

external interface MonthPickerProps : PickerDateProps<Moment>, Props
