package antd.datepicker

import moment.Moment
import react.*

external interface QuarterPickerComponent : ComponentType<QuarterPickerProps>

external interface QuarterPickerProps : PickerTimeProps<Moment>, Props
