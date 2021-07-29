package antd.datepicker

import moment.Moment
import react.*

external interface MonthPickerComponent : ComponentType<MonthPickerProps>

external interface MonthPickerProps : PickerDateProps<Moment>, RProps
