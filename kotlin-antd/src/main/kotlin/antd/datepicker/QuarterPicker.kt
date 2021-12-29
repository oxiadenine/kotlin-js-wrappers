package antd.datepicker

import moment.Moment
import react.*

external interface QuarterPickerComponent : ComponentClass<QuarterPickerProps>

external interface QuarterPickerProps : PickerTimeProps<Moment>, Props
