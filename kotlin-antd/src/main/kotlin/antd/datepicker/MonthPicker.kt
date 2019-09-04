package antd.datepicker

import react.*

external object MonthPickerComponent : Component<MonthPickerProps, RState> {
    override fun render(): ReactElement?
}

external interface MonthPickerProps : PickerProps, SinglePickerProps, RProps
