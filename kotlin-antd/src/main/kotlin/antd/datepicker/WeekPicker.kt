package antd.datepicker

import react.*

external object WeekPickerComponent : Component<WeekPickerProps, RState> {
    override fun render(): ReactElement?
}

external interface WeekPickerProps : PickerProps, SinglePickerProps, RProps
