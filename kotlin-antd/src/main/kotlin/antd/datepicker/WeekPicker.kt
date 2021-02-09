package antd.datepicker

import moment.Moment
import react.*

external object WeekPickerComponent : Component<WeekPickerProps, RState> {
    override fun render(): ReactElement?
}

external interface WeekPickerProps : PickerDateProps<Moment>, RProps