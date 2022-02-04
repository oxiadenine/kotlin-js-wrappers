package antd.datepicker

import moment.Moment
import react.*

external interface YearPickerComponent : ComponentClass<YearPickerProps>

external interface YearPickerProps : PickerDateProps<Moment>, Props
