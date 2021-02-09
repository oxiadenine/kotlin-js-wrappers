package antd.datepicker

import moment.Moment
import react.*

external object MonthPickerComponent : Component<MonthPickerProps, RState> {
    override fun render(): ReactElement?
}

external interface MonthPickerProps : PickerDateProps<Moment>, RProps
