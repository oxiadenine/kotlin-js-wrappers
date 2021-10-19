package antd.datepicker

import moment.Moment
import react.*

external interface YearPickerComponent : ComponentType<YearPickerProps>

external interface YearPickerProps : PickerDateProps<Moment>, Props
